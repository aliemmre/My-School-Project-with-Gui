/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LengthOfWords;

import java.io.IOException;

/**
 *
 * @author alise
 */
public class SixLettersWords implements AllWords{
     private String[] sixLettersWordsArray;
    private String[] sixLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile sixWords;

    public SixLettersWords() throws IOException {
        this.sixWords = new UploadWordsAndQuestionsFromFile(6);
        lengthOfArray = sixWords.howManyWordsSpesificLetters();
        sixLettersWordsArray = new String[lengthOfArray];
        sixLettersQuestionsArray = new String[lengthOfArray];

        sixWords.getFillInWordsAndQuestion(sixLettersWordsArray, sixLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

     @Override
    public String getRandomWord() {

        return sixLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return sixLettersQuestionsArray[random];
    }
}



