package ex_28052024_LearningList;

import java.util.HashSet;
import java.util.Set;

// Given an array of integers, return a set of unique elements
//int a[] = {1,2,2,3,3,4,5} -> input
//a[] = {1,2,3,4,5} -> output

public class Lab016 {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,3,4,5};
		Set<Integer> uniqueSet = new HashSet();
		for(int i : arr){
			uniqueSet.add(i);
		}
		System.out.println(uniqueSet);

	}
}
