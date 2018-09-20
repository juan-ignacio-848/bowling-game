package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void canScoreGameOfZeros() {
        int[] game = roll(0);
        assertThat(bowlingGame.score(game), is(0));
    }

    @Test
    public void canScoreGameOfOnes() {
        int[] game = roll(1);
        assertThat(bowlingGame.score(game), is(20));
    }

    private int[] roll(int scorePerGame) {
        int[] game = new int[20];
        for(int i = 0; i < 20; i++) {
            game[i] = scorePerGame;
        }
        return game;
    }
}
