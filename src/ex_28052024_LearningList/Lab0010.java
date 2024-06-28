package ex_28052024_LearningList;

import java.util.List;

public class Lab0010 {
	public static void main(String[] args) {

		List shopping_list = List.of("Eggs","Butter","Bread");
		System.out.println(shopping_list);

		List multiple_data = List.of(334, true, "Subho");
		System.out.println(multiple_data);

		System.out.println(shopping_list.get(2));
		System.out.println(shopping_list.indexOf("Butter"));
	}
}
