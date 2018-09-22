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
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_return_score_20_when_every_roll_is_1() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void should_return_score_16_when_rolling_a_spare_followed_by_3_and_then_0s() {
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(16));
    }

    @Test
    public void should_return_22_when_rolling_a_strike_followed_by_3_3_and_then_0s() {
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(22));
    }

    // Some acceptance tests.

    @Test
    public void should_return_300_when_rolling_twelve_strikes() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(), is(300));
    }

    @Test
    public void should_return_133_when_rolling_this_random_game() {
        game.roll(1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8, 6);
        assertThat(game.score(), is(133));
    }

    @Test
    public void should_return_12_when_rolling_a_spare_in_the_last_frame_followed_by_2() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 3,7, 2);
        assertThat(game.score(), is(12));
    }
}
