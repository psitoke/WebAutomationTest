
public class pracForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Jack12Cr43";
		String c = "Jack  Cr  ";
		String alpha="";
	
		
		for (int i=0; i<s.length(); i++) {
			
			if (s.charAt(i)==(c.charAt(i))) {
				alpha= "" + s.charAt(i);
				System.out.println(alpha+"**********");
			}
			else
			
				System.out.println(s.charAt(i));
			
		}

	}

}
