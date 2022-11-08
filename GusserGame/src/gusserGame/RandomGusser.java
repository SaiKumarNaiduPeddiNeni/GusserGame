package gusserGame;

import java.util.Random;

public class RandomGusser {
	int randomNumber;

	int generateNum(int range) {
		Random random = new Random();
		this.randomNumber = random.nextInt(range);
		System.out.println("Generated random number: "+randomNumber);
		return randomNumber;
	}

}
