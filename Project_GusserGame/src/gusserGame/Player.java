package gusserGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

	List<Integer> playerByNum(int playerNumber, int chances) {
		List<Integer> playerNum = new ArrayList<Integer>();
		if (chances == 5)
			System.out.println("Player " + playerNumber + " enter your guesses:");
		else
			System.out.println("Player " + playerNumber + " enter your guess:");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < chances; i++) {
			playerNum.add(scan.nextInt());
		}
		return playerNum;
	}

}
