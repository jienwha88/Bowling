package jienwha.Bowling;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class BowlingGametTest {

	
	public void initializeGame(){
		
	}
	
	@Test
	public void assertGameConstructor(){
		BowlingGame bg = new BowlingGame();
		List<Player> players = bg.getPlayers();
		assertEquals(players.size(), 0);
	}


	@Test
	public void assertPlayerSetup(){
		BowlingGame bg = new BowlingGame();
		bg.addPlayer("William");
		bg.addPlayer("Brian");

		assertEquals(bg.getPlayers().size(), 2);
        assertEquals(bg.getPlayers().get(0).getTotalScore(), 0);
        assertEquals(bg.getPlayers().get(1).getTotalScore(), 0);
	}

    @Test
    public void assertPlayerBowl(){
        BowlingGame bg = new BowlingGame();
        Player player1 = bg.addPlayer("William");
        int score = bg.bowl(player1);
        assertTrue("Assert that bowling is within 0 and 10", score >= 0 && score <= 10);

    }
}
