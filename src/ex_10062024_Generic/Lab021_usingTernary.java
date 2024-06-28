package ex_10062024_Generic;

public class Lab021_usingTernary {

	public static void main(String[] args) {
		System.out.println(maxThreeTernary(2, 6, 9));
		System.out.println(maxThreeTernary(80, 5, 4));
		System.out.println(maxThreeTernary(2,18 , 5));
	}

	public static <T extends Comparable<T>> T maxThreeTernary(T a,T b, T c){

		T d= (a.compareTo(b)>0) ? ((a.compareTo(c) >0) ? a:c) : ((b.compareTo(c) > 0)? b:c);
		return d;
	}
}
