package OOPS_Constructors;

public class Lab_005 {

	public static void main(String[] args) {

		Car c1 = new Car();     //whenever object is created the default constructor is called
	//Car -> Classname 	, c1 -> reference variable/object reference , new Car -> Object
		c1.print_details();

		Car c2 = new Car("Alto","red",180);  //whenever object is created parameterized constructor
		c2.print_details();                                      //is called in this called
	}
}
