package rasikaappln;
// occurance of a
public class CountCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Rasika Dhamane";
		int totalcount=str.length();
		System.out.println(totalcount);
	  int  totalCountAfterRemovingA=str.replace("R", "").length();
	  System.out.println(totalCountAfterRemovingA);
	  int count=totalcount-totalCountAfterRemovingA;
	  System.out.println("Number of times a repeated "+count);

	}

}
