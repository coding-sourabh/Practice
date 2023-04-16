import model.Dice;
import model.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Player> players = new ArrayList<>();
        players.add(Main.createPlayer("sourabh", 1, 0));
        players.add(Main.createPlayer("Leo", 2, 3));

        Game snakeAndLadderGame = new Game(5, 5, 3, 3, players);
        snakeAndLadderGame.startGame();
    }

    public static Player createPlayer(String name, Integer id, Integer cnt) {
        Player p = new Player();
        p.setName(name);
        p.setPlayerId(id);
        p.setVictoryCount(cnt);
        p.setCurrentPos(1);
        return p;
    }
}

// 1  2  3   4  5
// 6  7  8   9  10
// 11 12 13 14  15
// 16 17 18 19  20
// 21 22 23 24  25