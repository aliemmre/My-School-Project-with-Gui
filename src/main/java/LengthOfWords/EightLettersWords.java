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
public class EightLettersWords implements AllWords{
     private String[] eightLettersWordsArray;
    private String[] eightLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile eightWords;

    public EightLettersWords() throws IOException {
        this.eightWords = new UploadWordsAndQuestionsFromFile(8);
        lengthOfArray = eightWords.howManyWordsSpesificLetters();
        eightLettersWordsArray = new String[lengthOfArray];
        eightLettersQuestionsArray = new String[lengthOfArray];

        eightWords.getFillInWordsAndQuestion(eightLettersWordsArray, eightLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

     @Override
    public String getRandomWord() {

        return eightLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return eightLettersQuestionsArray[random];
    }
}
