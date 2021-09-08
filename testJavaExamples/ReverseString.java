public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "devil";
		char[] array =  s1.toCharArray();
		System.out.println("First conversion:"+s1);
		
		int len = array.length;
		//System.out.println(len);
		System.out.print("Reverse Conversion:");
		for (int i = len-1;i>=0; i--)
		{
			System.out.print(array[i]);
		}
	}

		


}
