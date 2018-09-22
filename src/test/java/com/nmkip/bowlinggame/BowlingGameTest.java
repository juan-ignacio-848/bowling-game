package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void should_score_0_when_every_roll_is_zero() {
        final int times = 20;
        final int pinsDown = 0;
        roll(times, pinsDown);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_score_20_when_every_roll_is_one() {
        roll(20, 1);
        assertThat(game.score(), is(20));
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }
}
