package rasikaappln;

import java.util.Arrays;

public class CheckArrayEql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,34};
		int a2[]= {1,2,34,67};
		
		boolean abc=Arrays.equals(a, a2);
		if(abc==true) {
			System.out.println("arrays r equals");
		}
		else {
			System.out.println("arrays r not equals");
		}

	}

}
