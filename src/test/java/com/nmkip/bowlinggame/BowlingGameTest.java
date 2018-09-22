package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void should_return_score_0_when_every_roll_is_0() {
        roll(20, 0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_return_score_20_when_every_roll_is_1() {
        roll(20, 1);
        assertThat(game.score(), is(20));
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }
}
