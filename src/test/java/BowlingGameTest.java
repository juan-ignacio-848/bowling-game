import com.nmkip.bowlinggame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setUp() {
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

    @Test
    public void should_score_16_when_rolling_a_spare_followed_by_3_then_0s() {
        roll(1, 5);
        roll(1, 5);
        roll(1, 3);
        roll(17, 0);
        assertThat(game.score()).isEqualTo(16);
    }

    private void roll(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            game.roll(pinsDown);
        }
    }
}
