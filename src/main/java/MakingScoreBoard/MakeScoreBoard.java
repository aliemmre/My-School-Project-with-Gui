
package MakingScoreBoard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MakeScoreBoard {
    // dosyayı alsın Sorted array olarak yollasın

    private final static String SUBMITS_FILE = "Submit.txt";

    private static List<String> submitsList;

    // !! burada hata var
    public static List<String> fillArrayFromFile(String file) {
        List<String> arrFile = new ArrayList<>();

        //sildim o basit kodu şimdi biraz arraylist yapcaz 
        // şimdi dosyları arraye dökmede 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            // arraye düzgün şekilde ekledik
            while ((line = reader.readLine()) != null) {
                arrFile.add(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sortingScore(arrFile);

        return arrFile;
    }

    private static List< String> sortingScore(List<String> ls) {
        // burada çok  iyii dehşet  kod var 
        Collections.sort(ls, (a, b) -> {
            String[] pa = a.split(": ");
            String[] pb = b.split(": ");

            int scoreA = (int)Double.parseDouble(pa[1]);
            int scoreB = (int)Double.parseDouble(pb[1]);

            // önce puan sıralama 
            int scoreCompare = Integer.compare(scoreB, scoreA);
            // burayı ters yazıyorum çünkü olay şöyle ilk parametre x diğeri y olsun x>y olsaydı 
            // + değer dönecekti x<y olsaydı negatif değer dönücekti 
            // compare(x,y)
            // bunun  llayı - ve + ya göre x ve y yi sıralamak 
            // eğer - olursa   yani   x geçsin der 
            // eğer + olursa yani  bu sefer y geçer 
            //  böle yazımda küçükten büyüğe elde edersin

            // eğer puan eşit deilse direk fazla puan başa geçer
            if (scoreCompare != 0) {
                return scoreCompare;
            }

            // eşit deilse süreye bakılır falza süresi olan öne geçer
            // burayı elle parse edip sayıyı çektim
            int timeA = Integer.parseInt(pa[2].replace(" seconds", "").trim());
            int timeB = Integer.parseInt(pb[2].replace(" seconds", "").trim());

            return Integer.compare(timeB, timeA);
        });

        return ls;
    }

}

