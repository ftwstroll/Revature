package array_practice;

import java.util.Arrays;

public class arrayp_main {

	public static void odds(int[] nums)
	{
		for(int i = 0; i < nums.length ; i++)
		{
			if (nums[i] % 2 != 0)
				System.out.println(nums[i]);
		}
	}
	
	public static void primes(int[] nums)
	{
		int c;
		
		for (int i = 0; i < nums.length; i++)
		{
			c=0;
			for (int j = 1; j <=nums[i]; j++) {
				if(nums[i] % j == 0) {
					c++;	
				}
			}
			if(c == 2) {
				System.out.println(nums[i]);
			}
		}
		
	}
	
	public static void palin(String pal)
	{
		boolean test = true;
		
		for(int i = 0; i < pal.length()/2; i++)
		{
			if(pal.charAt(i) != pal.charAt(pal.length()-i-1))
				test = false;
		}

		System.out.println("Result for " + pal + ": " + test);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,5,67,99,101,6,8};
		String pal = "noon";
		String npal = "evening";
		
		System.out.println(Arrays.toString(nums));
		System.out.println("odds check");
		odds(nums);
		
		System.out.println("\n\n");
		//System.out.println(nums);
		System.out.println("Prime check");
		primes(nums);
		
		System.out.println("\n\n");
		System.out.println(npal + " and " + pal);
		System.out.println("Palindrome check");
		palin(pal);
		palin(npal);
	}

}
