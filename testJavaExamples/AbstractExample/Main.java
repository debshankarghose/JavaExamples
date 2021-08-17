package AbstractExample;

public class Main {
    public static void main(String[] args) {
         StudentDetails obj = new StudentDetails(); /* you can create an object of subclass to access the abstract class methods
        in a package. */
        System.out.println(obj.fname);
        System.out.println(obj.lname);
        obj.student();
    }
}
