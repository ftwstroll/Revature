package buffer;

/*
 * 
 * Changed lecture code so that the last letter of each 
 * word is capitalized vs the first as shown by instructor
 * 
 * 
 */


public class LastLetterUpper {


	public static void main(String[] args) {
		String s="hello hi how are you doing today";
		
		String ar[]=s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			//the change occurred here by swapping 
			//Character.toUpperCase(ar[i].charAt(0))  AND   ar[i].substring(1)
			//then edit them: 
			//ar[i].substring(0,ar[i].length()-1 ---- selects all letters up-to the last letter
			//Character.toUpperCase(ar[i].charAt(ar[i].length()-1))  ---- this capitalizes the last letter
			//original code:
			//sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}

//Tasks
//Same example as above but try to covert every word's last letter to uppercase

