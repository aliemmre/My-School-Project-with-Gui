package Game;

import PlayerBehavior.*;

public class NormalPlayer extends Player {

    public NormalPlayer(String name, int Id,
            TakeLetterBehavior takeLetterBehavior,
            EstimateBehavior estimateBehavior) {

        super(name, Id, new WordEngine(takeLetterBehavior, estimateBehavior));
    }

    @Override
    public String displayWhichPlayer() {

        return "Welcome to our game " +getName();
    }

    @Override
    public String toString() {
        return super.toString();

    }

}
