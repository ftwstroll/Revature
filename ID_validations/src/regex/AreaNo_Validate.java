package regex;

public class AreaNo_Validate {

	
	
	public static void main(String[] args) {
		/*
		 *
		 * United State area code is 3 digits
		 * ###
		 * 
		 */
		String AC="12345678";
		if(isValideAC(AC)) 
		{
			System.out.println(AC+" VALIDATED");
		}
		else 
		{
			System.out.println(AC+" is INVALID");
		}
		
		AC="1234567@";
		if(isValideAC(AC)) 
		{
			System.out.println(AC+" VALIDATED");
		}
		else 
		{
			System.out.println(AC+" is INVALID");
		}
		
		AC="123";
		if(isValideAC(AC)) 
		{
			System.out.println(AC+" VALIDATED");
		}
		else 
		{
			System.out.println(AC+" is INVALID");
		}
		
		
	}
	
	public static boolean isValideAC(String AC) 
	{
		if(AC.matches("[0-9]{3}"))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
		
		
}

