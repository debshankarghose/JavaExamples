package MethodOverriding;

public class MethodOveriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMWbrand b = new BMWbrand(); //Since the class is public, it can be called from anywhere
		b.carStart();
		b.carGearbox();
		b.carPhysicalEntity(); /*This is called Static Polymorphism or compiletime polymorphism, 
		where child is extending the prop of parent*/
		System.out.println("\n--------------\n");
		
		CarClass c = new CarClass();
		c.carStart();
		c.carPhysicalEntity();
		c.carGearbox();
		
		System.out.println("\n--------------\n");
		
		CarClass c1 = new BMWbrand();
		c1.carStart(); /*object of class BMW can be called by CarClass reference variable 
		and this concept is called is Dynamic Polymorphism -- This is also called Top Casting */
		
		System.out.println("\n--------------\n");
		BMWbrand b1 = (BMWbrand)new CarClass(); /*Here we are casting the CarClass object to 
		BMW but will get runtime exception
		
		Exception in thread "main" java.lang.ClassCastException: MethodOverriding.CarClass cannot be cast to MethodOverriding.BMWbrand
	at MethodOverriding.MethodOveriden.main(MethodOveriden.java:24)
		 */
		
		
	}

}
