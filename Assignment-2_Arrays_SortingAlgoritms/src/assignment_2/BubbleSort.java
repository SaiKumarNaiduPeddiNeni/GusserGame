package assignment_2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m;
		int[] array;
		System.out.println("Enter the size of the array:");
		m = scan.nextInt();
		System.out.println("Enter " + m + " elements to fill first array:");
		array = new int[m];
		for (int i = 0; i < m; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Elements before sort: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		bubbleSort(array);
		System.out.println("Elements after sort: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		scan.close();
	}
	
	static int[] bubbleSort(int [] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j]<array[j-1]) {
					array[j]=(array[j-1]+array[j])-(array[j-1]=array[j]);
				}
			}
		}
		return array;
		
	}

}
