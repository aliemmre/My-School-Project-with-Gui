/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayerInformation;

/**
 *
 * @author aliemre
 */
import MakingScoreBoard.MakeScoreBoard;
import Game.Player;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import MakingScoreBoard.MakeScoreBoard;

public class Submit {
    //bura dolucak sonra
    //ID + Name + puan +süre/saat

    private Player player;

    private final String FILE = "Submit.txt";

    public Submit(Player player) {
        this.player = player;
    }
    //all submit karışık sırada

    public void writeOnScoreboard() throws IOException {

        try (FileWriter fw = new FileWriter(FILE, true)) {

            fw.write(player.getName() + ": " + player.getEngine().getScore()
                    + ": " + player.getEngine().getTimeManager().getTotalTime() + " seconds \n");

        }

    }

    public String writeOnLeaderboard() throws IOException {
        List<String> arr = MakeScoreBoard.fillArrayFromFile(FILE);
        String output = "";
        try (FileWriter fw = new FileWriter("LeaderBoard.txt", false)) {
            int i = 1;

            for (String string : arr) {
                if (i > 10) {
                    break;
                }
                fw.write((int) (i) + "." + string + "\n");
                output += (int) (i++) + "." + string + "\n";
            }

        }

        return output;

    }

}
