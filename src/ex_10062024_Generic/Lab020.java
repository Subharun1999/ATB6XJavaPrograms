package ex_10062024_Generic;

public class Lab020 {

	public static void main(String[] args) {
		System.out.println(maxNum(2, 6, 7));
		System.out.println(maxNum(8, 5, 4));
		System.out.println(maxNum(2,12 , 5));
	}


	public static <T extends Comparable<T>> T maxNum(T a, T b, T c){

		T max = a;
		if (b.compareTo(a)>0){
			max = b;
		}
		if(c.compareTo(max)>0){
			max = c;
		}

		return max;
	}

}
