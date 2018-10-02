package com.nmkip.bowlinggame;

public class Game {

    public static final int NUMBER_OF_FRAMES = 10;
    private int[] rolls = new int[21];
    private int rollsCursor = 0;

    public void roll(int pinsDown) {
        rolls[rollsCursor] = pinsDown;
        rollsCursor++;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for(int i = 0; i < NUMBER_OF_FRAMES; i++) {
            if(isStrike(cursor)) {
                score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
                cursor += 1;
            } else if(isSpare(cursor)) {
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int cursor) {
        return rolls[cursor] == 10;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }

    public void roll(int... rolls) {
        for(int pinsDown : rolls) {
            roll(pinsDown);
        }
    }
}
