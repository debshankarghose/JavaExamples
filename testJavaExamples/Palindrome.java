//import java.util.Arrays;
/*
 * if java.util.Arrays package is imported, then we print the array in an array format
 * with comma for the class Arrays.toString()

 * Here is another way to verify in a complete way by reversing the string to see,
 * if the string is a palindrome.
 */

import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args)
	{
		String p = "malayalam";
		char[] arry = p.toCharArray();
		System.out.println("String before Reversing: "+ Arrays.toString(arry));
		int len = arry.length; //assigns the size of array to the variable.
		char[] tmp = new char[len];
		//int i,j; // either can initialise variable i and j or directly below in for loop
		for(int i=len-1, j =0; i>=0 && j<=len-1; i--, j++)
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
			String rev1 = new String(tmp); /*or we can have the string with char array, if
											we write //String rev2 = Arrays.toString(tmp); */
		 	//String rev = String.valueOf(tmp); //this statement can also work in converting char array to String
			System.out.println(rev1);
			System.out.println("String after reversing: " +rev1);
			if (p.equals(rev1)) { /* here if(p==rev1), will not work,since == is an operator and compares the address
									reference, not the content, however .equals() compares the content */
				System.out.println("The String is palindrome");
			}else {
				System.out.println("The string is not a palindrome");
			}
	}
}

