package Game;

import PlayerBehavior.*;

public class WordEngine {

    private WordState wordState;
    private TimeManager timeManager;
    private ScoreManager scoreManager;
    private TakeLetterBehavior takeLetterBehavior;
    private EstimateBehavior estimateBehavior;

    public WordEngine(TakeLetterBehavior takeLetterBehavior, EstimateBehavior estimateBehavior) {
        this.wordState = null;
        this.timeManager = new TimeManager(120);
        this.scoreManager = new ScoreManager();
        this.takeLetterBehavior = takeLetterBehavior;
        this.estimateBehavior = estimateBehavior;
    }

    public void setNewWord(String newAnswer) {

        this.wordState = new WordState(newAnswer);
    }

    public void performTakingLetter() {
        takeLetterBehavior.takeLetter(wordState.getCurrent(), wordState.getAnswer());
    }

    public boolean performEstimate(String guess) {
        return estimateBehavior.estimate(
                wordState.getAnswer(),
                guess,
                wordState.getCurrent()
        );
    }

    public boolean isCompleted() {
        return wordState.isCompleted();
    }

    public char[] getCurrent() {
        return wordState.getCurrent();
    }

    public String getAnswer() {
        return wordState.getAnswer();
    }

    public String getPrintNoVisibleState() {

        return wordState.fillingArrayAsANotVisible(getCurrent());
    }

    public String getPrintVisibleState() {

        return wordState.printCurrentArr(getCurrent());

    }

    public TimeManager getTimeManager() {
        return timeManager;

    }

    public double getScore() {
        return scoreManager.getScore();
    }

    public double addScore(int howManyGotLetter) {
        return scoreManager.addScore(wordState.getAnswer(), howManyGotLetter);
    }

    public double removeScore(int howManyGotLetter) {
        return scoreManager.removeScore(wordState.getAnswer(), howManyGotLetter);
    }

    public double getReachableScore(int howManyGotLetter) {

        return scoreManager.canTakeScore(getAnswer(), howManyGotLetter);
    }
}
