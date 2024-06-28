package OOPS_Inheritance;

public class Father {

	int factory;           //instance variables
	int flats;

	 Father(int factory, int flats){         //parameterized constructor
		this.factory = factory;
		this.flats = flats;
	}

	void hasCar(){                           //methods
		System.out.println("I have a car");
	}

	 void house(){
		System.out.println("3bhk");
	}

	 void printInfo(){
		System.out.println("Father has " +this.factory+" factories and also has " +this.flats+ " number of flats");
	}
}
