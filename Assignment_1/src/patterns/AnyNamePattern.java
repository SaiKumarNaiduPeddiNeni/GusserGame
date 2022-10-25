package patterns;

import java.util.Scanner;

public class AnyNamePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int n = sc.nextInt();
		System.out.print("Enter the name to print: (like I Neuron or Any name)");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String name = sc.nextLine();
		/*
		 * String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; int n = 9;
		 */
		name = name.toUpperCase();
		System.out.println(name);
		char[] array = name.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < n; i++) {
			for (char a : array) {

				if (a == 'A') {

					for (int j = 0; j < n; j++) {
						if ((i == 0 && j != 0 && j != n - 1) || ((j == 0 || j == n - 1) & i > 0) || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'B') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || ((i == 0 || i == n - 1) && j != n - 1) || (i == n / 2 && j != n - 1)
								|| (j == n - 1 && (i != n / 2 && i != 0 && i != n - 1))) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'C') {

					for (int j = 0; j < n; j++) {
						if ((j == 0 && i != 0 && i != n - 1) || i == 0 && j > 0 || i == n - 1 && j > 0) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'D') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || ((i == 0 || i == n - 1) && j != n - 1)
								|| ((i != 0 && i != n - 1) && j == n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'E') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'F') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || i == 0 || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'G') {
					for (int j = 0; j < n; j++) {
						if (i == 0 && j != 0 || (i == (3 * n) / 4 && j != 0) || j == 0 && i < 3 * n / 4 && i != 0
								|| j == n / 2 && i >= n / 2 && i < 3 * n / 4 || i == n / 2 && j > n / 2
								|| j == n - 1 && i > n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'H') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || (j == n - 1) || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'I') {

					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || j == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'J') {

					for (int j = 0; j < n; j++) {
						if (i == 0 || (i == n - 1 && j < n / 2 && j != 0) || j == 0 && (i > n / 2 && i != n - 1)
								|| j == n / 2 && i != n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'K') {

					for (int j = 0; j < n; j++) {
						if (j == n / 2 || (i + j == n - 1 && i <= n / 2) || i == j && i > n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'L') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || (i == n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'M') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || ((i == j || i + j == n - 1) && i <= n / 2 || j == n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'N') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || i == j || j == n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'O') {

					for (int j = 0; j < n; j++) {
						if ((i == 0 && j != 0 && j != n - 1) || (i == n - 1 && j != 0 && j != n - 1)
								|| (j == 0 && i != 0 && i != n - 1) || (j == n - 1 && i != 0 && i != n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'P') {

					for (int j = 0; j < n; j++) {
						if ((j == 0) || (i == 0 && j != n - 1) || (i == n / 2 && j != n - 1)
								|| (j == n - 1 && i < n / 2 && i != 0)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'Q') {

					for (int j = 0; j < n; j++) {
						if ((i == 0 && j != 0 && j < n - 2) || (i == n - 2 && j != 0 && j < n - 2)
								|| (j == 0 && i != 0 && i < n - 2) || (j == n - 2 && i != 0 && i < n - 2)
								|| i == j && i >= n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'R') {

					for (int j = 0; j < n; j++) {
						if ((j == 0) || (i == 0 && j < n / 2) || (i == n / 2 && j < n / 2)
								|| (j == n / 2 && i < n / 2 && i != 0) || i - j == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				if (a == 'S') {

					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || (j == 0 && i < n / 2) || (j == n - 1 && i > n / 2) || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'T') {

					for (int j = 0; j < n; j++) {
						if (i == 0 || j == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'U') {

					for (int j = 0; j < n; j++) {
						if ((j == 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1)
								|| (j == n - 1 && i != n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'V') {

					for (int j = 0; j < n; j++) {
						if ((i == j || i + j == n - 1) && i <= n / 2) {
							System.out.print("*");

						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'W') {

					for (int j = 0; j < n; j++) {
						if (j == 0 || ((i == j || i + j == n - 1) && i >= n / 2 || j == n - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}

				if (a == 'X') {

					for (int j = 0; j < n; j++) {
						if (i == j || i + j == n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'Y') {

					for (int j = 0; j < n; j++) {
						if (((i == j || i + j == n - 1) && i < n / 2) || (j == n / 2 && i >= n / 2)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == 'Z') {

					for (int j = 0; j < n; j++) {
						if (i == 0 || (i == n - 1) || i + j == n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
				}
				if (a == ' ') {

					for (int j = 0; j < n/2; j++) {
						System.out.print(" ");
					}
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		sc.close();
	}

}
