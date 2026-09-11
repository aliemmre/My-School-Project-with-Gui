
package Game;


public abstract  class Player {

    private String name;
    private int Id;

    private WordEngine engine;

    public Player(String name, int Id,
            WordEngine engine) {

        this.name = name;

        this.Id = Id;
        this.engine = engine;
    }

    abstract public String displayWhichPlayer();

    public WordEngine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getId() {

        return Id;
    }

    public void displayName() {
        System.out.println("Welcome to our game " + name);
    }

    @Override
    public String toString() {
        return "\nName " + getName() + " \nYour score : " + getEngine().getScore();

    }
}
