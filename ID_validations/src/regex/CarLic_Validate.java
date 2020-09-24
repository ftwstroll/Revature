package regex;

public class CarLic_Validate {
	
	public static void main(String[] args) {
		/*
		 *
		 * License plates consist of 7 mixed numbers 
		 * and Capitalized
		 * letters
		 *  ******
		 * 
		 */
		String LP="12345678";
		if(isValideLP(LP)) 
		{
			System.out.println(LP+" VALIDATED");
		}
		else 
		{
			System.out.println(LP+" is INVALID");
		}
		
		LP="12@567";
		if(isValideLP(LP)) 
		{
			System.out.println(LP+" VALIDATED");
		}
		else 
		{
			System.out.println(LP+" is INVALID");
		}
		
		LP="1A2B3C";
		if(isValideLP(LP)) 
		{
			System.out.println(LP+" VALIDATED");
		}
		else 
		{
			System.out.println(LP+" is INVALID");
		}
		
		
	}
	
	public static boolean isValideLP(String LP) 
	{
		if(LP.matches("[A-Z0-9]{6}"))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
		
		
}