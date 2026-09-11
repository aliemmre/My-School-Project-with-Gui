
package AdminProcess;

import MakingScoreBoard.MakeScoreBoard;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alise
 */
public class AdminSystem {

    private final static String USERS_WORDS_AND_QUESITONS_FILE = "UsersWordsAndQuestions.txt";
    private final static String WORDS_AND_QUESTION_FILE = "WordsAndQuestions.txt";
    private final static String SUBMITS_FILE = "Submit.txt";
    private final static String USERSNAMES_AND_PASSWORDS_FILE = "UsernameAndPasswords.txt";
    private final static String LEADERBOARD_FILE = "LeaderBoard.txt";

    private static List<String> usersWordsAndQuestionsList;
    private static List<String> usernamesAndPasswordsList;

    private static List<String> submitsList;
    private static List<String> leaderBoard;

    public static void fillFilesWithLists() {
        usersWordsAndQuestionsList = fillArrayFromFile(USERS_WORDS_AND_QUESITONS_FILE);
        submitsList = fillArrayFromFile(SUBMITS_FILE);
        usernamesAndPasswordsList = fillArrayFromFile(USERSNAMES_AND_PASSWORDS_FILE);
        leaderBoard = fillArrayFromFile(LEADERBOARD_FILE);
    }

    public static List<String> fillArrayFromFile(String file) {
        List<String> arrFile = new ArrayList<>();

        //sildim o basit kodu şimdi biraz arraylist yapcaz 
        // şimdi dosyları arraye dökmede 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                arrFile.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrFile;
    }
    // submitin hepsini yani //unreverse ettim metdou yani 
    //normalde eklemeli gitse call stacten ters yazlcaktı

    // Id ve isim göstercek paraloyu sansür atcaz
    public static String listofAllPlayersInformation(String output, int i) {
        if (i < usernamesAndPasswordsList.size()) {
            String[] parts = usernamesAndPasswordsList.get(i).split("###");
            if (parts.length == 3) {
                output += "Id: " + parts[0] + " Name: " + parts[1] + " Password: ****" + "\n";
            }
            return listofAllPlayersInformation(output, i + 1);

        } else {
            return output;
        }

    }

    public static String listOfAllPlayerGames(String output, int i) {
        // EĞER LİSTE BOŞSA ÖNCE DOLDUR
        if (submitsList == null) {
            fillFilesWithLists();
        }
        if (i < submitsList.size()) {

            String line = submitsList.get(i);

            output += line + "\n";

            return listOfAllPlayerGames(output, i + 1);

        } else {
            return output;
        }
    }

    public static String listLeaderBoard(String output, int i) {
        if (i < leaderBoard.size()) {
            output += leaderBoard.get(i) + "\n";
            return listLeaderBoard(output, i + 1);
        } else {
            return output;
        }

    }

    public static String searchPlayerGames(String output, String name, int i) {
        if (i < submitsList.size()) {
            //: için index

            int index = submitsList.get(i).indexOf(":");
            if (index == -1) {
                return searchPlayerGames(output, name, i + 1);
            }

            String tempName = submitsList.get(i).substring(0, index);
            if (tempName.equals(name)) {

                output += submitsList.get(i) + "\n";
                return searchPlayerGames(output, name, i + 1);
            } else {
                return searchPlayerGames(output, name, i + 1);
            }

        } else {
            return output;

        }

    }

    // oyuncualrın sorualrını listeleiyor
// buradan incele uygunsuz soru varsa kullanıcıyı her yerden banla
    public static String listOfPlayerQuestions(String output, int i) {
        if (i < usersWordsAndQuestionsList.size()) {
            output += usersWordsAndQuestionsList.get(i) + "\n";
            return listOfPlayerQuestions(output, i + 1);
        } else {
            return output;
        }

    }

    public static boolean deletePlayer(int Id) {
        String temp = "" + Id;

        // bu submitten silmemin tek yolu 
        String name = "";

        boolean check = false;

        // neden böle burası çünkü abi direk baştan yapsan her sildiğinde 
        //indexler bir sağa kaydığı için sen aslında silerken bir tane elemana bakmadan geçicen 
        //diğer tur  ve aynı zmaanda da sizeda eksilcek nullexception riskide doğururabilir
        //
        for (int i = usernamesAndPasswordsList.size() - 1; i >= 0; i--) {
            if (temp.length() == 3 && usernamesAndPasswordsList.get(i).contains(temp)) {
                String parts[] = usernamesAndPasswordsList.get(i).split("###");

                name = parts[1];
                System.out.println("name:" + name);
                usernamesAndPasswordsList.remove(i);

                check = true;

            }
        }
        for (int i = usersWordsAndQuestionsList.size() - 1; i >= 0; i--) {
            if (temp.length() == 3 && usersWordsAndQuestionsList.get(i).contains(temp)) {
                usersWordsAndQuestionsList.remove(i);
                check = true;
            }
        }
        for (int i = submitsList.size() - 1; i >= 0; i--) {

            int index = submitsList.get(i).indexOf(":");
            if (index != -1) {
                String tempName = submitsList.get(i).substring(0, index);
                if (temp.length() == 3 && tempName.equals(name)) {
                    submitsList.remove(i);
                    check = true;
                }
            }
        }
        writeListToFile(usernamesAndPasswordsList, USERSNAMES_AND_PASSWORDS_FILE);
        writeListToFile(usersWordsAndQuestionsList, USERS_WORDS_AND_QUESITONS_FILE);
        // leraderboard değişcek
        writeListToFile(submitsList, SUBMITS_FILE);
        leaderBoard = MakeScoreBoard.fillArrayFromFile(SUBMITS_FILE);

        return check;

    }

    private static void writeListToFile(List<String> list, String fileName) {
        //false açtım çünkü rewirte lazım
        try (FileWriter fw = new FileWriter(fileName, false)) {
            for (String line : list) {
                fw.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean addUsersQuestion() throws IOException {

        try (FileWriter fw = new FileWriter(WORDS_AND_QUESTION_FILE, true)) {
            if (usersWordsAndQuestionsList.isEmpty()) {
                return false;
            }

            for (int i = 0; i < usersWordsAndQuestionsList.size(); i++) {
                fw.write(usersWordsAndQuestionsList.get(i) + "\n");

            }

        }
        try (FileWriter fw = new FileWriter(USERS_WORDS_AND_QUESITONS_FILE, false)) {
            fw.write("\n");

        }
        return true;
    }

    public static void deleteSubmitsResult() throws IOException {
        try (FileWriter fw = new FileWriter(LEADERBOARD_FILE, false)) {

        }
        try (FileWriter fw = new FileWriter(SUBMITS_FILE, false)) {

        }
        submitsList = fillArrayFromFile(SUBMITS_FILE);
        leaderBoard = fillArrayFromFile(LEADERBOARD_FILE);

    }

 
}
