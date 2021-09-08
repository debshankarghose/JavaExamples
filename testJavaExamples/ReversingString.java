import org.jetbrains.annotations.NotNull;

public class ReversingString {
	/*The string is reversed by calling revStr method instead of passing the arguments
	 in the main function */
	public static void main(String args[]) {
		ReversingString r = new ReversingString();
		String s = "debshankar";
		System.out.println(s);
		System.out.println("Printing in reverse");

		r.revStr(s);
	}
	
	public void revStr(@NotNull String str) {
		char[] arr = str.toCharArray();
		for (int i = arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
		}
	}
}
