package assignment_2;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int m;
		int[] array;
		System.out.println("Enter the size of the array");
		m = scan.nextInt();
		array = new int[m];
		//System.out.println("Enter " + m + " elements to fill first array:");
		for (int i = 0; i < m; i++) {
			array[i] = r.nextInt(1000);
		}
		for(int i=0;i<m;i++) {
			System.out.println(array[i]);
		}

		System.out.println("after");
		quickSorting(array, 0, array.length-1);
		
		for(int i=0;i<m;i++) {
			System.out.println(array[i]);
		}

		scan.close();

	}

	static void quickSorting(int[] array, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (array[rightPointer] >= pivot && rightPointer > leftPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		swap(array, leftPointer,highIndex);
		
		quickSorting(array, lowIndex, leftPointer-1);
		quickSorting(array, leftPointer+1, highIndex);

	}

	static void swap(int[] array, int leftIndex, int rightIndex) {
		array[leftIndex]=(array[leftIndex]+array[rightIndex])-(array[rightIndex]=array[leftIndex]);
	}

}
