package ex_28052024_LearningList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab013 {

	public static void main(String[] args) {

		List<String> sub = new ArrayList<>();
		sub.add("Maths");
		sub.add("English");
		sub.add("History");

		List num = new ArrayList();
			num.add(445);
			num.add(76);
			num.add(889);

			 sub.addAll(num);
			System.out.println(sub);

			//Using for each loop to print
			for(Object obj : sub){
				System.out.print(obj+ " ");
			}
		System.out.println("\n");
		System.out.println("-----------------");

		//To print in order
		ListIterator lt = sub.listIterator();
		lt.add("xyz");

		while(lt.hasNext()){
			System.out.println(lt.next());
		}

		System.out.println("-----------------");

		//To print in reverse order
		ListIterator lt2 = sub.listIterator(sub.size());
		while(lt2.hasPrevious()){
			System.out.println(lt2.previous());
		}

	}
}
