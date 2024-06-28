package ex_28052024_LearningList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab015_Student {

	public static void main(String[] args) {

		Student student1 = new Student(2, "Ashish");
		Student student2 = new Student(8, "Dhiraj");
		Student student3 = new Student(1, "Salman");

		List<Student> stud = new ArrayList<>();
		stud.add(student1);
		stud.add(student2);
		stud.add(student3);
		System.out.println(stud);
		Collections.sort(stud, new sortByIDAsc());
		System.out.println(stud);

	}
}
