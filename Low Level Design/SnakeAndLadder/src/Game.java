import model.*;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private Board board;
    private Dice dice;
    private List<Player> players;
    private Player winner;
    Deque<Player> nextTurn = new LinkedList<>();

    Game(Integer noOfRows, Integer noOfCols, Integer noOfSnakes, Integer noOfLadders, List<Player> players) {
        board = new Board(noOfRows, noOfCols, noOfSnakes, noOfLadders);
        dice = new Dice();
        this.players = players;
        nextTurn.addAll(players);
    }

    public void startGame() {
        while(this.winner == null) {
            Player player = nextTurn.getFirst();
            nextTurn.removeFirst();
            System.out.println(player.getName() + " is at position " + player.getCurrentPos());

            Integer diceNo = this.dice.rollDice();
            Integer newPosition = checkForSnakeAndLadder(player.getCurrentPos() + diceNo);
            System.out.println("New position is : " + newPosition);
            if(newPosition >= board.getBoardRows() * board.getBoardCols()) {
                player.setVictoryCount(player.getVictoryCount() + 1);
                System.out.println("Winner is : " + player.getName());
                break;
            }
            player.setCurrentPos(newPosition);
            nextTurn.addLast(player);
        }
    }

    private Integer checkForSnakeAndLadder(int newPos) {
        if(newPos >= board.getBoardRows() * board.getBoardCols())
            return newPos;

        int finalPosition = newPos;
        Cell cell = this.board.getCell(newPos);
        Snake snake = cell.getSnake();
        Ladder ladder = cell.getLadder();
        if(snake != null) {
            finalPosition = snake.getDest();
            System.out.println("bitten");
        } else if(ladder != null) {
            finalPosition = ladder.getDest();
            System.out.println("got ladder");
        }
        return finalPosition;
    }
}
