package ex_28052024_LearningList;

import java.util.ArrayList;
import java.util.List;

public class Lab012 {
	public static void main(String[] args) {

		List mylist = new ArrayList();
		mylist.add("Vinod");
		mylist.add("Ramesh");
		mylist.add("ramesh");
		mylist.add("Subho");
		mylist.add(false);
		mylist.add(900.76);

		for(Object obj : mylist){
			System.out.println(obj);
		}

		System.out.println("-------------------");
		//Another way to print
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
	}
}
