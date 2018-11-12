package com.nmkip.bowlinggame;

public class BowlingGame {

    private int[] rolls = new int[21];
    private int lastRoll = 0;

    public void roll(int pinsDown) {
        rolls[lastRoll] = pinsDown;
        lastRoll++;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for(int frame = 0; frame < 10; frame++) {
            if(rolls[cursor] + rolls[cursor + 1] == 10) {
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }
        return score;
    }
}
