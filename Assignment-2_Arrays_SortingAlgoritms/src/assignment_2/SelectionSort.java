package assignment_2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		int[] array;
		System.out.println("Enter the size of the array");
		m = scan.nextInt();
		array = new int[m];
		System.out.println("Enter " + m + " elements to fill array:");
		for (int i = 0; i < m; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Elements before sort: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		SelectionSorting(array);
		System.out.println("Elements after sort: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		scan.close();

	}
	
	static void SelectionSorting(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minValue=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[minValue]>= array[j]) {
					minValue=j;
				}
			}
			array[minValue]=(array[minValue]+array[i])-(array[i]=array[minValue]);
		}
	}

}
