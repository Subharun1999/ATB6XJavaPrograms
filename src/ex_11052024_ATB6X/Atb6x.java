package ex_11052024_ATB6X;

public class Atb6x {

	public static void main(String[] args) {

		//Creating object of first student
		Student s1 = new Student();

		s1.name = "Rohit";
		s1.rollNum = 22;
		s1.age = 22;
		s1.profession = "Fresher";
		s1.isRegular();
		s1.onlineModeSession();
		s1.display();

		Course c1 = new Course();
		c1.setCourseName();
		c1.courseID();
		c1.stream = "Electrical Eng";
		c1.dispcd();

		Payment p1 = new Payment();
		p1.courseFee = 3000;
		p1.modeOfPayment = "Credit card";
		p1.fullPayment = false;
		p1.isItPaid();
		p1.InstallmentAmount(1509.8f);
		p1.dispPay();

		System.out.println("--------------------");

		//Creating object of second student
		Student s2 = new Student();

		s2.name = "Ayush";
		s2.rollNum = 25;
		s2.age = 23;
		s2.profession = "Tester";
		s2.isRegular();
		s2.onlineModeSession();
		s2.display();

		Course c2 = new Course();
		c2.setCourseName();
		c2.courseID();
		c2.stream = "Mechanical Eng";
		c2.dispcd();

		Payment p2 = new Payment();
		p2.courseFee = 3000;
		p2.modeOfPayment = "Debit card";
		p2.fullPayment = true;
		p2.isItPaid();
		p2.InstallmentAmount(0);
		p2.dispPay();
	}
}
