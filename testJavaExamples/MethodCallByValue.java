
public class MethodCallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCallByValue obj = new MethodCallByValue();
		int x = 12;
		int y = 14;
		int maintot = obj.sum(x, y); // a copy of a and b is given here, we are calling the method by passing or calling it with value.
		System.out.println(maintot);
	}
	

	public int sum(int a, int b) {
		int tot = a+b;
		return tot;
		
	}
}
