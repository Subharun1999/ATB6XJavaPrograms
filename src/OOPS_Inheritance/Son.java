package OOPS_Inheritance;

public class Son extends Father{

	Son(int factory, int flats) {
		super(factory, flats);
	}

	void printInfo(){
		 super.house();
		 super.hasCar();
		System.out.println("The new feature is: "+super.factory+ " and " +this.flats);
	}

}


