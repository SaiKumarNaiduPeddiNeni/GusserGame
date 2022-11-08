package gusserGame;

import java.util.List;
import java.util.Scanner;

public class LaunchGame {

	public static void main(String[] args) {
		int m, randomNum, chances;
		RandomGusser gusser = new RandomGusser();
		Umpire umpire = new Umpire();
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter the max number to generate the random number: (if max Num is less than 6 players will have only one chance to play, else you will 5 chances");
		m = scan.nextInt();
		randomNum = gusser.generateNum(m);
		chances = (m <= 5) ? 1 : 5;
		@SuppressWarnings("rawtypes")
		List<List> winnersAndRunners = umpire.compare(randomNum, chances);
		System.out.println("Winners List:");
		for (int i = 0; i < winnersAndRunners.get(0).size(); i++) {
			System.out.println(winnersAndRunners.get(0).get(i));
		}
		System.out.println();
		System.out.println("Loosers List:");
		for (int i = 0; i < winnersAndRunners.get(1).size(); i++) {
			System.out.println(winnersAndRunners.get(1).get(i));
		}
		scan.close();
	}

}
