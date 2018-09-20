package com.nmkip.bowlinggame;

public class BowlingGame {

    public int score(int[] game) {
        int score = 0;
        for(int i = 0; i < game.length; i++) {
            score += game[i];
        }
        return score;
    }
}
