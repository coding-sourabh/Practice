package model;

public class Cell {
    public Snake snake;
    public Ladder ladder;

    Cell() {
    }

    Cell(Snake snake, Ladder ladder) {
        this.snake = snake;
        this.ladder = ladder;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }
}
