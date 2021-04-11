
public class BooleanValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BooleanValidate b = new BooleanValidate();
		boolean mod = b.TestBoolean(4, 2);
		System.out.println(mod);
	}
	
	public boolean TestBoolean(int x, int y) {
		
		if(x%y == 0)
		{
			return true;
		}
				
		return false;
		
		
	}

}
