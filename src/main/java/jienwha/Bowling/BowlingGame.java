package jienwha.Bowling;

import java.util.*;

public class BowlingGame {

	private List<Player> players;

	public BowlingGame(){
		players = new ArrayList<>();
	}


	public void addPlayer(String name) {
		Player player = new Player(name);
		players.add(player);
	}


	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
