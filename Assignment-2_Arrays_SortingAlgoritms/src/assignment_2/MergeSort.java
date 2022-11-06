package assignment_2;

import java.util.Scanner;

public class MergeSort {

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
		divide(array);
		System.out.println("Elements before sort: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		scan.close();
	}

	static void divide(int[] array) {
		if(array.length<2) {
			return ;
		}
		int[] firstArray;
		int[] secondArray;
		int mid = (array.length) / 2;
		firstArray = new int[mid];
		secondArray = new int[array.length - mid];
		for (int i = 0; i < mid; i++) {
			firstArray[i] = array[i];
		}
		for (int j = mid; j < array.length; j++) {
			secondArray[j - mid] = array[j];
		}
		divide(firstArray);
		divide(secondArray);
		merge(array, firstArray, secondArray);
	}

	static void merge(int[] array, int [] leftArray, int[] rightArray) {
		int i,j,k;
		i=j=k=0;
		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]<=rightArray[j]) {
				array[k]=leftArray[i];
				i++;
			}
			else {
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<leftArray.length) {
			array[k]=leftArray[i];
			k++;
			i++;
		}
		while(j<rightArray.length) {
			array[k]=rightArray[j];
			k++;
			j++;
		}
		
	}

}
