package model;

import java.util.Random;

public class Board {
    private Cell[][] cells;
    private final Integer boardRows;
    private final Integer boardCols;
    private Integer snakesCnt;
    private Integer ladderCnt;

    public Board(Integer noOfRows, Integer noOfCols, Integer noOfSnakes, Integer noOfLadders) {
        this.boardRows = noOfRows;
        this.boardCols = noOfCols;
        this.snakesCnt = noOfSnakes;
        this.ladderCnt = noOfLadders;

        this.initializeBoard();
        this.addSnakeAndLadders();
    }

    private void initializeBoard() {
        cells = new Cell[boardRows][boardCols];
        for(int i = 0; i < boardRows; i++) {
            for(int j = 0; j < boardCols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakeAndLadders() {
        int totalCells = boardRows * boardCols;
        while(this.ladderCnt > 0) {
            // this random will generate a value from 1 to n*m
            int start = new Random().nextInt(totalCells - 1) + 1;
            int end = new Random().nextInt(totalCells - 1) + 1;

            Cell cell = getCell(start);

            if(start >= end || cell.getSnake() != null || cell.getLadder() != null) {
                continue;
            }
            Ladder ladder = new Ladder();
            ladder.setSrc(start);
            ladder.setDest(end);

            cell.setLadder(ladder);
            ladderCnt--;
        }

        while(this.snakesCnt > 0) {
            // this random will generate a value from 1 to n*m
            int start = new Random().nextInt(totalCells - 1) + 1;
            int end = new Random().nextInt(totalCells - 1) + 1;

            if(start == end)
                continue;

            Cell cell = getCell(start);
            if(start <= end || cell.getSnake() != null || cell.getLadder() != null) {
                continue;
            }
            Snake snake = new Snake();
            snake.setSrc(start);
            snake.setDest(end);

            cell.setSnake(snake);
            snakesCnt--;
        }
    }

    public Cell getCell(int pos) {
        int row = pos / this.boardRows;
        int col = pos % this.boardCols;
        return this.cells[row][col];
    }

    public Integer getBoardRows() {
        return boardRows;
    }

    public Integer getBoardCols() {
        return boardCols;
    }
}

//  0 1 2
//0 1 2 3
//1 4 5 6
//2 7 8 9