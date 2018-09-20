package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canScoreAGameOfZeros() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }

    @Test
    public void canScoreAGameOfOnes() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void canScoreASpareFollowedBya3() {
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(16));
    }

    @Test
    public void canScoreAStrikeFollowedByA3AndA6() {
        game.roll(10, 3,6, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(28));
    }

    @Test
    public void canScorePerfectGame() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(), is(300));
    }

    @Test
    public void acceptanceTest() {
        game.roll(1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8, 6);
        assertThat(game.score(), is(133));
    }

    @Test
    public void acceptanceTest2() {
        game.roll(1,4, 4,5, 6,4, 5,5, 5,5, 0,1, 7,3, 6,4, 2,2, 2,8, 6);

        assertThat(game.score(), is(103));
    }

}
