package ex_11052024_ATB6X;

public class Student {

	String name;
	int rollNum;
	int age;
	String profession;

	public void isRegular()
	{
		System.out.println("The student is regular in class");
	}

	public void onlineModeSession()
	{
		System.out.println("The students prefers online mode session");
	}

	public void display()
	{
		System.out.println("The name of student is: "+name);
		System.out.println("The roll_number of student is: "+rollNum);
		System.out.println("The age of the student is: "+age);
		System.out.println("The profession of the student is: "+profession);
	}
}
