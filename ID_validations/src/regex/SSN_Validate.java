package regex;

public class SSN_Validate {
	
	
	public static void main(String[] args) {
		/*
		 *
		 * SSN = ###-###-####
		 * 
		 */
		String SSN="123-46-7890";
		if(isValideSSN(SSN)) {
			System.out.println(SSN+" VALIDATED");
		}else {
			System.out.println(SSN+" is INVALID");
		}
		
		SSN="123-456-7890";
		if(isValideSSN(SSN)) {
			System.out.println(SSN+" VALIDATED");
		}else {
			System.out.println(SSN+" is INVALID");
		}
		
	}
	
	public static boolean isValideSSN(String SSN) {
		if(SSN.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
