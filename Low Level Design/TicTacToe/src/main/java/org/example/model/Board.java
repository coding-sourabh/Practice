package org.example.model;

public class Board {
    public Integer size;
    PlayingPiece [][] board;

    Board(Integer size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for(int i = 0; i < this.size; i++) {
            for(int j = 0; j < this.size; j++) {
                if(this.board[i][j] == null) {
                    System.out.print("* ");
                } else {
                    System.out.print(this.board[i][j].peiceType + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean addPiece(int inputRow, int inputCol, PlayingPiece playingPiece) {
        if(board[inputRow][inputCol] == null) {
            board[inputRow][inputCol] = playingPiece;
            return true;
        }
        return false;
    }
}
