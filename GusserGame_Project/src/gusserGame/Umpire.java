package gusserGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Umpire {

	List<String> winners;
	List<String> loosers;
	Player[] players;
	@SuppressWarnings("rawtypes")
	List<List> announcement;
	RandomGusser randomNum;

	@SuppressWarnings("rawtypes")
	List<List> compare(int random, int chances) {
		Scanner scan = new Scanner(System.in);
		if (chances == 5)
			System.out.println("Enter the number of players wants to play: Each player will have " + chances
					+ " chances to guess the number");
		else
			System.out.println("Enter the number of players wants to play: Each player will have " + chances
					+ " chance to guess the number");
		int playerCount = scan.nextInt();
		winners = new ArrayList<String>();
		loosers = new ArrayList<String>();
		announcement = new ArrayList<>();
		for (int i = 0; i < playerCount; i++) {
			players = new Player[playerCount];
			players[i] = new Player();
			List<Integer> playerNum = players[i].playerByNum(i + 1, chances);
			int j;
			for (j = 0; j < chances; j++) {
				if (playerNum.get(j) == random) {
					winners.add("player" + (i + 1) + ": gussed the number at " + (j + 1) + " guess.");
					break;
				}
			}
			if (j == chances) {
				loosers.add("player" + (i + 1));
			}
		}
		scan.close();
		announcement.add(winners);
		announcement.add(loosers);
		return announcement;

	}

}
