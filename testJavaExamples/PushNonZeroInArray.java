
public class PushNonZeroInArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int arry[] = {5,8,8, 6, 5};
		int count = 0;
		try {
		for(int i = 0; i<arry.length;i++)
		{
			if (arry[i]==5)
			{
				arry[i+1] = arry[i];
				count++;
				
			}
			else
				i++;

		}
		}
		catch(Exception e) {
		}
		for(int i=0;i<arry.length; i++)
			System.out.println(arry[i]);
		

	
	}
	
		
}
	
