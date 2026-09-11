
package LengthOfWords;

import java.io.IOException;

public class TenLettersWords implements AllWords {

    private String[] tenLettersWordsArray;
    private String[] tenLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile tenWords;

    public TenLettersWords() throws IOException {
        this.tenWords = new UploadWordsAndQuestionsFromFile(10);
        lengthOfArray = tenWords.howManyWordsSpesificLetters();
        tenLettersWordsArray = new String[lengthOfArray];
        tenLettersQuestionsArray = new String[lengthOfArray];

        tenWords.getFillInWordsAndQuestion(tenLettersWordsArray, tenLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

    public String getRandomWord() {

        return tenLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return tenLettersQuestionsArray[random];
    }
}
