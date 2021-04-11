
public class ForPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "DEB";
		ForPalindrom p = new ForPalindrom();
		System.out.println(p.Rev(str));
		
	}
		public String Rev(String r) {
			
			char[] arr = r.toCharArray();
			
			for(int i =arr.length-1;i>=0; i--)
			{
				System.out.print(arr[i]);
				}
		return r;
		}




		
	}

