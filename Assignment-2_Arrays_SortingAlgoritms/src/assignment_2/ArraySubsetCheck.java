package assignment_2;

import java.util.Scanner;

public class ArraySubsetCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, n;
		int[] firstArray;
		int[] secondArray;
		System.out.println("Enter the size of the first array:");
		m = scan.nextInt();
		System.out.println("Enter the size of the second array:");
		n = scan.nextInt();
		System.out.println("Enter " + m + " elements to fill first array:");
		firstArray = new int[m];
		for (int i = 0; i < m; i++) {
			firstArray[i] = scan.nextInt();
		}
		System.out.println("Enter " + n + " elements to fill first array:");
		secondArray = new int[n];
		for (int i = 0; i < n; i++) {
			secondArray[i] = scan.nextInt();
		}

		if (m < n) {
			if (subSet(firstArray, secondArray))
				System.out.println("first array is subset of second array");
			else
				System.out.println("Not subset");
		} else {
			if (subSet(secondArray,firstArray))
				System.out.println("second array is subset of first array");
			else
				System.out.println("Not subset");
		}

	scan.close();

	}

	static boolean subSet(int[] firstArray, int[] SecondArray) {
		if (firstArray == SecondArray) {
			return true;
		}
		for (int i = 0; i < firstArray.length; i++) {

			for (int j = 0; j < SecondArray.length; j++) {
				if (firstArray[i] == SecondArray[j]) {
					break;
				}
				if (j == SecondArray.length - 1) {
					return false;
				}
			}

		}
		return true;

	}

}
