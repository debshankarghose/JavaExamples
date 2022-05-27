package AbstractExample;

public class Main {
    public static void main(String[] args) {
        PreMainDefiningAbstract abs = new StudentDetails();
        StudentDetails obj = new StudentDetails(); /* you can create an object of subclass to access the abstract class methods
        in a package. */
        System.out.println(obj.fname); //or System.out.println(abs.fname);
        System.out.println(obj.lname); // or System.out.println(abs.lname);
        obj.student();
    }
}
