package ex_23042024;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch) ;

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}

		sc.close();
	}
}
