import java.util.*; 

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    int maxi = -1;
    String kk;
    int vv;
    /**
	 * Defining Our Action in MyBiConsumer class
	 * https://www.geeksforgeeks.org/hashmap-foreachbiconsumer-method-in-java-with-examples/#:~:text=The%20forEach(BiConsumer)%20method%20of,in%20the%20order%20of%20iteration.
	 */
	public class MyBiConsumer implements BiConsumer<String, Integer> {

		public void accept(String k, Integer v) {
			/*
			 * System.out.print("Key = " + k); System.out.print("\t Value = " + v);
			 * System.out.println();
			 */
			if (maxi < v){
				maxi = v;
                kk=k;
                vv=v;
            }
		}

	}
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
		 * while (it.hasNext()) { int val = it.next().getValue(); if (val > maxi) maxi =
		 * val; }
		 */
		System.out.println(kk);
	}
    
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
