
public class ReturnTwoVal {

	// Function code
	public static int[] something(){
	    int number1 = 1;
	    int number2 = 2;
	    return new int[] {number1, number2};
	}

	// Main class code
	public static void main(String[] args) {
	  int[] ret = something();
	  System.out.println(ret[0] + ret[1]);
	}
}
