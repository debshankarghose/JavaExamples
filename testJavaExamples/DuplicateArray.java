
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateArray obj = new DuplicateArray();
		obj.CheckDup();		
	}

	public void CheckDup() {
		
		int arr[] = {1,3,1,5,1,5};
		int arrSize = arr.length;
		System.out.println(arrSize);
		
		int count=0;
		for(int i = 0; i<arrSize; i++)
		{
			for(int j = i+1; j<arrSize; j++) {
				if (arr[i]== arr[j]) {
					count++;
				}			
			}
			if(count==1)
				System.out.println("Duplicate value is: "+ arr[i]);
			 count = 0;

		}


	}
}
