//import java.util.Arrays; 
/*\
 * if java.util.Arrays package is imported, then we print the array in an array format
 * with comma for the class Arrays.toString()
 */

/*
 * Here is another way to verify in a complete way by reversing the string to see,
 * if the string is a palindrome.
 * 
 */

public class Palindrome {
	
	public static void main(String args[])
	{

	
		String p = "malayalam";
		char[] arry = p.toCharArray();
		
		
		System.out.print("String before Reversing: ");
		System.out.println(arry);
		
		int len = arry.length;
		//System.out.println(len);
		char[] tmp = new char[len];
		//System.out.println(tmp);

//int i,j;
		
		for(int i=len-1, j =0; i>=0 && j<=len-1; i-- , j++) 
		{
			
				tmp[j] = arry[i];
				//System.out.println(tmp);
			}

			//String rev = new String(tmp,2,7); 
		/*
		 * just to check what part of the string to be returned from starting index
		 * which is 2 and counting 7 from index 2
		 */
		
//Multiple ways of converting char array to string
			//String rev1 = new String(tmp);
		 String rev = String.valueOf(tmp); 
			//String rev = Arrays.toString(tmp);
			System.out.println(rev);
				
			System.out.println("String after reversing: " +rev);
			
			if (p == rev) {
				System.out.println("The String is palindrome");
			}
			System.out.println("The string is not a palindrome");
		
		
			

	}
}

