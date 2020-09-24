package regex;

public class DLNo_Validate {

	
	public static void main(String[] args) {
		/*
		 *
		 * Texas DL number is 8 digits
		 * ########
		 * 
		 */
		String DL="12345678";
		if(isValideDL(DL)) {
			System.out.println(DL+" VALIDATED");
		}else {
			System.out.println(DL+" is INVALID");
		}
		
		DL="1234567@";
		if(isValideDL(DL)) {
			System.out.println(DL+" VALIDATED");
		}else {
			System.out.println(DL+" is INVALID");
		}
		
		DL="12345";
		if(isValideDL(DL)) {
			System.out.println(DL+" VALIDATED");
		}else {
			System.out.println(DL+" is INVALID");
		}
		
		
	}
	
	public static boolean isValideDL(String DL) {
		if(DL.matches("[0-9]{8}")) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
