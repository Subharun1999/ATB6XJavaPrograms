package ex_28052024_LearningList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Lab014 {

	public static void main(String[] args) {

		Stack<String> st = new Stack<>();
		st.push("Ankit");
		st.push("Arijit");
		st.add("Vinod");
		st.push("Sanju");

		for(Object obj : st){
			System.out.println(obj);
		}

		System.out.println("-------------");

		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);

		// To print the items in list format
		Iterator lt = st.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
	}
}
