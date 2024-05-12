package ex_04052024;

public class Greatest_array {

	public static void main(String[] args) {

		int a[] = {30,50,60,90,10, 100,999};
		int max = a[0];         // storing the 0th element of the array in max

		for (int i = 0; i < a.length; i++) {

			if(a[i] > max){               //comparing the 0th element with every element in the array
				 max = a[i];                //storing the maximum element in max
			}
		}
		System.out.println("The maximum number is:" +max);


	}
}
