package bowling;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Bowling {
	private int maxiV = -1;
	private String maxiK;
	private HashMap<String, Integer> players;

	public int getMaxiV() {
		return maxiV;
	}

	public void setMaxiV(int maxiV) {
		this.maxiV = maxiV;
	}

	public String getMaxiK() {
		return maxiK;
	}

	public void setMaxiK(String maxiK) {
		this.maxiK = maxiK;
	}

	public HashMap<String, Integer> getPlayers() {
		return players;
	}

	public void setPlayers(HashMap<String, Integer> players) {
		this.players = players;
	}

	/**
	 * Defining Our Action in MyBiConsumer class
	 * https://www.geeksforgeeks.org/hashmap-foreachbiconsumer-method-in-java-with-examples/#:~:text=The%20forEach(BiConsumer)%20method%20of,in%20the%20order%20of%20iteration.
	 * Embedded class = inner class
	 */
	public class MyBiConsumer implements BiConsumer<String, Integer> {

		public void accept(String kk, Integer vv) {
			/*
			 * System.out.print("Key = " + k); System.out.print("\t Value = " + v);
			 * System.out.println();
			 */
			if (maxiV < vv) {
				maxiK = kk;
				maxiV = vv;
			}
		}

	}

	Bowling() {
		players = new HashMap<String, Integer>();
	}

	public void addPlayer(String name, int p) {
		players.put(name, p);
	}

	// your code goes here
	public void getWinner() {
		// Iterator<Object> it = players.iterator();

		// players.get(key)
		/**
		 * players.forEach(entry -> { System.out.println(); });
		 */
		/**
		 * creating a custom action
		 * https://www.geeksforgeeks.org/hashmap-foreachbiconsumer-method-in-java-with-examples/#:~:text=The%20forEach(BiConsumer)%20method%20of,in%20the%20order%20of%20iteration.
		 */

		BiConsumer<String, Integer> action = new MyBiConsumer();

		// calling forEach method
		players.forEach(action);

		/*
		 * while (it.hasNext()) { int val = it.next().getValue(); if (val > maxiV) maxiV
		 * = val; }
		 */
		// System.out.println(players.get(key));
		// System.out.println(kk);
		System.out.println(this.getMaxiK());

	}

}
