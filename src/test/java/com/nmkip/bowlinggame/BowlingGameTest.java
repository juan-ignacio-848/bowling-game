package com.nmkip.bowlinggame;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BowlingGameTest {

    @Test
    public void should_score_0_when_every_roll_is_zero() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_score_20_when_every_roll_is_one() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertThat(game.score(), is(20));
    }
}
