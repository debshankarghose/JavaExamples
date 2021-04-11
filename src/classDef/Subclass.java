package classDef;

public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        //Superclass s = new Superclass();
    	Subclass s = new Subclass();
        s.printMethod();    
    }
}