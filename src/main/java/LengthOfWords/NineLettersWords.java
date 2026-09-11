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
public class NineLettersWords implements AllWords{
     private String[] nineLettersWordsArray;
    private String[] nineLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile nineWords;

    public NineLettersWords() throws IOException {
        this.nineWords = new UploadWordsAndQuestionsFromFile(9);
        lengthOfArray = nineWords.howManyWordsSpesificLetters();
        nineLettersWordsArray = new String[lengthOfArray];
        nineLettersQuestionsArray = new String[lengthOfArray];

        nineWords.getFillInWordsAndQuestion(nineLettersWordsArray, nineLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

     @Override
    public String getRandomWord() {

        return nineLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return nineLettersQuestionsArray[random];
    }
}

