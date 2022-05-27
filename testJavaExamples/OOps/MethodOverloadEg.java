package OOps;

public class MethodOverloadEg { //multiple methods can have the same name with different parameters

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		MethodOverloadEg obj = new MethodOverloadEg();
		//obj.sum(10, 20); 
		/*Method overloading is a concept where method with same name under the 
		same class have different arguments/parameters/dataTypes are used */
		obj.sum();
		double p = 10;
		double q = 20;
		double s1 = obj.sum(p,q);
		System.out.println(s1);
	}
	
	public void sum() {
		System.out.println("Same method name with different argument can overide as well");
	}
	public int sum(int x, int y)
	{
		int z = x+y;
    	 //System.out.println("Sum of integer vals is returned:" +z);
		 return z;
	}
	public double sum(double a, double b) {
		double c = a+b;
		//System.out.println("Summation of decimel vals is returned:"+c);
		return c;
	}
}
