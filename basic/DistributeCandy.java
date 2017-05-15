package basic;

import java.util.HashSet;
import java.util.Random;

public class DistributeCandy {

	public static void main(String[] args) {
		int[] candies = new int[10];

		for (int i = 0; i < candies.length; i++) {
			candies[i] = new Random().nextInt(10);
		}

		HashSet<Integer> set = new HashSet<Integer>();

		for (int candy : candies) {
			set.add(candy);
		}
		
		// because both need to have equal amount of candies 
		// n/2 is the max amount of candies one can have, hence we take min just in case we have more than n/2 unique candies
		System.out.println(Math.min(set.size(), candies.length / 2));
	}
}
