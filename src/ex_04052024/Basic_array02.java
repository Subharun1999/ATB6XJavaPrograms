package ex_04052024;

import java.util.Scanner;

public class Basic_array02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] s1 = new int[4];    //declaring an array of size 4

		System.out.println("Enter the numbers: ");
		for (int i = 0; i <s1.length ; i++) {     //initialising numbers to the array from user
			s1[i] = sc.nextInt();
		}

		System.out.println("Doubling the array and storing into another array");
		int a1[] = new int[4];                    // declaring another array of same size to store the values of s1[]
		for (int i = 0; i < s1.length; i++) {
			 a1[i] = s1[i]*2;
			System.out.println(a1[i]);
		}

		sc.close();
	}
}
