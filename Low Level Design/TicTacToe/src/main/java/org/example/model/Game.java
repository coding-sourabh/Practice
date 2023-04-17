package org.example.model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public Board gameBoard;
    public Deque<Player> players = new LinkedList<>();

    public Game(int boardSize, List<Player> gamePlayers) {
        gameBoard = new Board(boardSize);
        players.addAll(gamePlayers);
    }

    public void startGame() {
        boolean noWinner = true;
        while(noWinner == true) {
            // get the player whose turn is next
            Player playerTurn = players.removeFirst();

            // print the board
            gameBoard.printBoard();

            System.out.println(playerTurn.getName() + " your turn, Enter your piece position");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String []values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean addedSuccessfully = this.gameBoard.addPiece(inputRow, inputCol, playerTurn.getPlayingPiece());
            if(!addedSuccessfully) {
                System.out.println("Incorrect position entered, Please try again :(");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winnerFound = isWinner(playerTurn.getPlayingPiece().peiceType, inputRow, inputCol);

            if(winnerFound) {
                this.gameBoard.printBoard();
                System.out.println(playerTurn.getName() + " is the winner");
                noWinner = false;
            }
        }
    }

    boolean isWinner(PeiceType pieceType, int row, int col) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean leftDiagonalMatch = true, rightDiagonalMatch = true;
        for(int i = 0; i < gameBoard.size; i++) {
            if(this.gameBoard.board[row][i] == null || this.gameBoard.board[row][i].peiceType != pieceType) {
                rowMatch = false;
            }

            if(this.gameBoard.board[i][col] == null || this.gameBoard.board[i][col].peiceType != pieceType) {
                colMatch = false;
            }
        }

        for(int i = 0, j = gameBoard.size-1; i < this.gameBoard.size; i++, j--) {
            if(this.gameBoard.board[i][i] == null || this.gameBoard.board[i][i].peiceType != pieceType) {
                leftDiagonalMatch = false;
            }
            if(this.gameBoard.board[i][j] == null || this.gameBoard.board[i][j].peiceType != pieceType) {
                rightDiagonalMatch = false;
            }
        }
        return rowMatch || colMatch || leftDiagonalMatch || rightDiagonalMatch;
    }
}
