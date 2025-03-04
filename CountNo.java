package rasikaappln;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter digit ");
		int num=s1.nextInt();
		int count=0;
		//int a=0;
		
		while(num!=0) {
			num=num/10;   //gives 432
			count=count+1;
		}
        System.out.println(count);
	}

}
