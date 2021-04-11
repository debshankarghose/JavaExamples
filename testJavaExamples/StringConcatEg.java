
public class StringConcatEg {
	
	public static void main(String args[])
	{
		//StringConcatEg s = new StringConcatEg(); since we are using staitc we do not need to create a object to refer the static method.
		String ns = strconcat("Hello World.", " How are you");
		System.out.println(ns);
	}

	
	public static String strconcat(String s1 , String s2) {

		String s3 = s1 + s2;
		return s3;
	}

	
}
