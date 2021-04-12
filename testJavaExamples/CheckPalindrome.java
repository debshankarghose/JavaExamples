
public class CheckPalindrome {
	//code to palindrome.

	    public static void main(String [] args){
	        CheckPalindrome pn = new CheckPalindrome();
	        
	        String chkStr = "malayalam";
	        pn.isPalindrome(chkStr);
	        System.out.println(chkStr);
	        if(pn.isPalindrome(chkStr)){
	            System.out.println("The string "+chkStr+" is a Palindrome");
	        } else {
	            System.out.println("The string is not a Palindrome");
	        }   
	    }

	    public boolean isPalindrome(String ispalin){
	        int i = ispalin.length()-1;
	        int j=0;
	        while(i > j) {
	            if(ispalin.charAt(i) != ispalin.charAt(j)) {
	                return false;
	            }
	            i--;
	            j++;
	        }
	        return true;
	    }
	}

	/*
	Unit Testcases:

	private void testEmpty()
	{
	- assert(isPalindrome("") = = false)
	- assert(isPalindrome("malayalam") = = true)
	- assert(isPalindrome("Anny") = = false)
	- assert(isPalindrome("ABC%$1D") = = false)
	- assert(isPalindrome(null) = = false)
	}
*/
