package patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		 int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
