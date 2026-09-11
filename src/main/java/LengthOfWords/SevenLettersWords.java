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
public class SevenLettersWords implements AllWords{
     private String[] sevenLettersWordsArray;
    private String[] sevenLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile sevenWords;

    public SevenLettersWords() throws IOException {
        this.sevenWords = new UploadWordsAndQuestionsFromFile(7);
        lengthOfArray = sevenWords.howManyWordsSpesificLetters();
        sevenLettersWordsArray = new String[lengthOfArray];
        sevenLettersQuestionsArray = new String[lengthOfArray];

        sevenWords.getFillInWordsAndQuestion(sevenLettersWordsArray, sevenLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

     @Override
    public String getRandomWord() {

        return sevenLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return sevenLettersQuestionsArray[random];
    }
}


 