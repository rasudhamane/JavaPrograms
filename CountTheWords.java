package rasikaappln;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter string");
		int count = 1;
		String s = s1.nextLine();
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
