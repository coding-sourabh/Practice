package model;

import java.util.Random;

public class Dice {
    public final Integer maxNumber = 6;

    public Integer rollDice() {
        return new Random().nextInt(6) + 1;
    }
}
