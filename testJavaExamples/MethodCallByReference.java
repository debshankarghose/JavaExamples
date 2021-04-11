
public class MethodCallByReference {
	int a;
	int b;
	private int temp; /*Either we can declare private int in the class to use temp in swap method 
						or can declare int temp directly under swap method. */
	
	
	
	public static void main(String args[]) {
		MethodCallByReference obj = new MethodCallByReference();

		obj.a= 50;
		obj.b = 60;
		System.out.println("Actual value of a:" +obj.a);
		System.out.println("Actual value of b:" +obj.b);
		System.out.println("\n--------------------------\n");
		obj.swap(obj);
		System.out.println("Swapped value of a:"+obj.a);
		System.out.println("Swapped value of b:"+obj.b);
		
	
	}
	
	
	public void swap(MethodCallByReference t) {
		

		t.temp = t.a; //temp = 50
		t.a = t.b; //a = 60
		t.b = t.temp; //b = 50		
		
		
	}
}
