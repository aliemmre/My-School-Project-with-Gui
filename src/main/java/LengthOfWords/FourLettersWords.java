package LengthOfWords;

import java.io.IOException;

/**
 *
 * @author alise
 */
public class FourLettersWords implements AllWords {

    private String[] fourLettersWordsArray;
    private String[] fourLettersQuestionsArray;
    private int lengthOfArray;
    private int random;

    private UploadWordsAndQuestionsFromFile fourWords;

    public FourLettersWords() throws IOException {
        this.fourWords = new UploadWordsAndQuestionsFromFile(4);
        lengthOfArray = fourWords.howManyWordsSpesificLetters();
        fourLettersWordsArray = new String[lengthOfArray];
        fourLettersQuestionsArray = new String[lengthOfArray];

        fourWords.getFillInWordsAndQuestion(fourLettersWordsArray, fourLettersQuestionsArray);
        this.random = (int) (Math.random() * lengthOfArray);
    }

    public String getRandomWord() {

        return fourLettersWordsArray[random];
    }

    @Override
    public String getQuestion() {

        return fourLettersQuestionsArray[random];
    }
}
