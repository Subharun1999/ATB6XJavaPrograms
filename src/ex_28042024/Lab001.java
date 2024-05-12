package ex_28042024;

public class Lab001 {

	public static void main(String[] args) {
		String pass = "Subho@112";
		String pass2 = "subho@112";
		String p1 = new String("subho@112");
		System.out.println(pass == pass2);
		System.out.println(pass.equals(pass2));
		System.out.println(p1 == pass2);         //compares each characters stored inside the string
		System.out.println(p1.equals(pass2));
	}
}
