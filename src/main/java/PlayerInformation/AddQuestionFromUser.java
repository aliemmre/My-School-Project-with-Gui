package PlayerInformation;

import java.io.FileWriter;

public class AddQuestionFromUser {

    final static private String FILE = "UsersWordsAndQuestions.txt";

    public static void addQuestion(String question, String answer, int Id) {

        try (FileWriter fw = new FileWriter(FILE, true)) {

            fw.write(answer + "###" + question + "###" + Id + "\n");

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
