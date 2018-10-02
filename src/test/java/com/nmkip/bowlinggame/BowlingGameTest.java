package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void should_score_0_when_rolling_a_game_of_0s() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void should_score_20_when_rolling_a_game_of_1s() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void should_score_18_when_rolling_a_spare_followed_by_4_then_0s() {
        game.roll(4,6, 4,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(18));
    }

    @Test
    public void should_score_22_when_rolling_a_strike_followed_by_4_2_then_0s() {
        game.roll(10, 4,2, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(22));
    }

    @Test
    public void should_score_300_when_rolling_a_perfect_game() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(), is(300));
    }
}
