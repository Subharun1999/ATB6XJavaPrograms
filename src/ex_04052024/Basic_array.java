package ex_04052024;

import java.util.Scanner;

public class Basic_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++){
			System.out.println("Enter the marks of "+ (i+1) + " subject");
			arr[i] = sc.nextInt();
		}

		System.out.println("Printing the marks: ");
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);

		}
	}
}
