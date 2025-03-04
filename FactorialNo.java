package rasikaappln;
//5== 5*4*3*2*1== 120
public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
