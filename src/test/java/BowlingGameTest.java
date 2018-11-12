import com.nmkip.bowlinggame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void should_score_0_when_rolling_a_game_of_0s() {
        roll(20, 0);
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    public void should_score_20_when_rolling_a_game_of_1s() {
        roll(20, 1);
        assertThat(game.score()).isEqualTo(20);
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }
}
