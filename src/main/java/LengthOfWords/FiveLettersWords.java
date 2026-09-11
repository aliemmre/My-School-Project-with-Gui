/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LengthOfWords;

import java.io.IOException;

public class FiveLettersWords implements AllWords{
     private String[] fiveLettersWordsArray;
    private String[] fiveLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile fiveWords;

    public FiveLettersWords() throws IOException {
        this.fiveWords = new UploadWordsAndQuestionsFromFile(5);
        lengthOfArray = fiveWords.howManyWordsSpesificLetters();
        fiveLettersWordsArray = new String[lengthOfArray];
        fiveLettersQuestionsArray = new String[lengthOfArray];

        fiveWords.getFillInWordsAndQuestion(fiveLettersWordsArray, fiveLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

     @Override
    public String getRandomWord() {

        return fiveLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return fiveLettersQuestionsArray[random];
    }
}


