import com.nmkip.bowlinggame.BowlingGame;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BowlingGameTest {

    @Test
    public void should_score_0_when_rolling_a_game_of_0s() {
        BowlingGame game = new BowlingGame();
        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score()).isEqualTo(0);
    }
}
