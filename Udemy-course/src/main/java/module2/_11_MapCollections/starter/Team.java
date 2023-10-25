package module2._11_MapCollections.starter;

import java.util.HashMap;
import java.util.Map;

public class Team {

	private String name;
	private Map<String, String> players;

	public Team(String name) {
		// set the name.
		// set players equal to a new HashMap.

		this.name = name;
		this.players = new HashMap<>();
	}

	public String getName() {
		// return the name
		return this.name;
	}

	public void setName(String name) {
		// set the name
		this.name = name;
	}

	public String getPlayer(String position) {
		// return a player from the HashMap.
		return players.get(position);
	}

	public void setPlayer(String position, String player) {
		// Add a <String, String> entry into the HashMap
		players.put(position, player);
	}

}
