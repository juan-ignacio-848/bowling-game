package com.nmkip.bowlinggame;

public class Game implements Bowling {

    private final int NUMBER_OF_FRAMES = 10;
    private int[] rolls = new int[21];
    private int lastRollIndex = 0;

    @Override
    public void roll(int... rolls) {
        for (int pinsDown : rolls) {
            roll(pinsDown);
        }
    }

    @Override
    public void roll(int pinsDown) {
        rolls[lastRollIndex] = pinsDown;
        lastRollIndex += 1;
    }

    @Override
    public int score() {
        int score = 0;
        int cursor = 0;

        for(int frame = 0; frame < NUMBER_OF_FRAMES; frame++) {
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

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }

    private boolean isStrike(int cursor) {
        return rolls[cursor] == 10;
    }

}
