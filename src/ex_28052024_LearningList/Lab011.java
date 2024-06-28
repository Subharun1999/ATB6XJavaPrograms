package ex_28052024_LearningList;

import java.util.ArrayList;
import java.util.List;

public class Lab011 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Subho");
		list.add(234);
		list.add("Dhruv");
		list.add(89.09);
		list.add('S');
		System.out.println(list);

		// List lst = new List() ; //Since list is an interface we cannot create an object out of it
	}
}
