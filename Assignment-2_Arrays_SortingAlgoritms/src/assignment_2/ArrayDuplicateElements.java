package assignment_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Set<Integer> uniqueelements = new HashSet<>();
		Set<Integer> duplicatedElements = new HashSet<>();
		int[] array;
		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();
		array = new int[n];
		System.out.println("Fill the array with " + n + " elements");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (!uniqueelements.add(array[i])) {
				duplicatedElements.add(array[i]);
			}
		}
		if (uniqueelements.size() != array.length) {
			System.out.println("Duplicate elemets are:");
			System.out.println(duplicatedElements);
		} else {
			System.out.println("No duplicate elements in the array");
		}

		scan.close();
	}

}
