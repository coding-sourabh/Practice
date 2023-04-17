package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        Player p1 = createPlayer("sourabh", new PieceX());
        Player p2 = createPlayer("Marco", new PieceO());
        playerList.add(p1);
        playerList.add(p2);
        Game ticTacToeGame = new Game(3, playerList);
        ticTacToeGame.startGame();
    }

    private static Player createPlayer(String name, PlayingPiece playingPiece) {
        Player p = new Player();
        p.setName(name);
        p.setPlayingPiece(playingPiece);
        return p;
    }
}