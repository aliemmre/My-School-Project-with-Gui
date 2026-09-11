
package LengthOfWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;


public class UploadWordsAndQuestionsFromFile {

    private final String FILE = "WordsAndQuestions.txt";

    private int len;

    public UploadWordsAndQuestionsFromFile(int len) {
        this.len = len;
    }

    public int howManyWordsSpesificLetters() throws IOException {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("###");
                if (parts[0].length() == len) {
                    count++;
                }
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return count;
    }

    public void getFillInWordsAndQuestion(String[] words, String[] questions) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("###");
                if (parts[0].length() == len) {
                    words[index] = parts[0];
                    questions[index++] = parts[1];

                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
