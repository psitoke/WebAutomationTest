
public class arrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr1= new int[5];
		arr1[0]=2; arr1[1]=4; arr1[2]=6; arr1[3]=8; arr1[4]=10;

		int [] arr2= {1,3,5,7,9};
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);  }
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);  }
			
	
		String[] names = {"sam","curran","bill","baran"};
		
		for (int i=0; i< names.length; i++) {
			
			System.out.println(names[i]);
			
		}
		
		char [] val = {'A', 'B', 'C'};

		for (int i=0; i<val.length; i++) {
			System.out.println(val[i]);
		}
	
	
	}
	
}
