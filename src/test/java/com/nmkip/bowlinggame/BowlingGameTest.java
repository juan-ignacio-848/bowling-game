package com.nmkip.bowlinggame;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class BowlingGameTest {

    @Test
    public void canScoreAGameOfZeros() {
        Game game = new Game();
        game.roll(0);
        assertThat(game.score(), is(0));
    }
}
