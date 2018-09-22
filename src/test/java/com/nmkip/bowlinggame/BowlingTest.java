package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BowlingTest {

    private Bowling game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void should_score_0_when_every_roll_is_zero() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_score_20_when_every_roll_is_one() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void should_score_18_when_rolling_a_spare_followed_by_four_then_zeros() {
        game.roll(5,5, 4,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(18));
    }

    @Test
    public void should_score_24_when_rolling_a_strike_followed_by_four_three_then_zeros() {
        game.roll(10, 4,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(24));
    }

    // --------------------------------------------------------------------------
    // -- Acceptance Tests ------------------------------------------------------
    // --------------------------------------------------------------------------
    
    @Test
    public void should_score_300_when_rolling_a_perfect_game() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(), is(300));
    }

    @Test
    public void should_score_133_when_rolling_this_random_game() {
        game.roll(1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8, 6);
        assertThat(game.score(), is(133));
    }
}
