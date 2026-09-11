package Game;

public class Admin extends Player {

   
    public Admin() {
        super(null, 0, null);

    }

    @Override
    public String displayWhichPlayer() {

        return "Welcome to our game little Admin";
    }
}
