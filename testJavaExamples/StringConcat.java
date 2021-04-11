
public class StringConcat {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcat s = new StringConcat();
		String sn1 = s.concatStr();
		System.out.println(sn1);
	
		
	}

	
	public String concatStr() {
	String s1 = "100";
	String s4 = "200";
	String s2 = "How are you doing";
	String s3 = s1 +s4+s2; 
	//System.out.println(s3);
	return s3;
	}
}
