package OOPS_Constructors;

public class Car {

	String name = "Maruti";               //instance variables
	String color;
	float top_speed;
	int seating_capacity = 4;

	Car()
	{
		color = "red";              
		top_speed = 150.0f;
		seating_capacity = 4;
	}

	 Car(String name, String color, float top_speed) {
		this.name = name;
		this.color = color;
		this.top_speed = top_speed;
	}

	void print_details()
	{
		System.out.println(name +" is the name of car with a top speed of " + top_speed + " with seating capacity " +
				seating_capacity);
	}
}
