package rasikaappln;

public class DuplicateEleOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Rasika","Java","Rasika","tas"};
		
		for(int i =0;i<arr.length;i++) {
			//to iterate to check java == rasika n rest
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate element "+arr[i]);
				}
				
			}
		}

	}

}
