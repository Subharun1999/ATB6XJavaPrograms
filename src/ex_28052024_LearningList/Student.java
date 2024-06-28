package ex_28052024_LearningList;

import java.util.Comparator;

class sortByIDAsc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
}
class sortByIDDesc implements Comparator<Student> {
	@Override
	public int compare(Student o2, Student o1) {
		return Integer.compare(o2.getId(), o1.getId());
	}
}

public class Student implements Comparable<Student>{


	Integer id;
	String name;

	public Student (Integer id, String name){
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString(){
		return "Student{"+" id = "+id +" name = " +name+ "}";
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.id, o.id);
	}
}
