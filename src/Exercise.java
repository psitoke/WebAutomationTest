
public class Exercise {

	public static void main(String[] args) {
	    int[] numbers= {2,3,4,5,6};
	    
	    System.out.println("The first element of the numbers array:" + numbers[0]);
	    System.out.println("The last element of the numbers array:" + numbers[4]);
	    System.out.println("***********"); 
	    System.out.println("numbers array in reverse order");
	    
	    for (int i =numbers.length-1; i>=0; i--){
	 	    	
	        System.out.println(numbers[i]);
	    }     

	 // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + numbers.length);
	}
}
