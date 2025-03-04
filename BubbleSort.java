package rasikaappln;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,10,90};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Integer b[]= {30,70,80};
		//sort in descending order
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		

	}

}
