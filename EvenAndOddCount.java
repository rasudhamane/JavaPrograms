package rasikaappln;

public class EvenAndOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int even_no = 0;
		int odd_no = 0;

		while (num > 0) {
			int rem=num%10;
            if(rem%2==0) {
            	even_no++;
            }
            else {
            	odd_no++;
            }
            num=num/10;
        
		}
	    System.out.println(even_no);
        System.out.println(odd_no);

	}

}
