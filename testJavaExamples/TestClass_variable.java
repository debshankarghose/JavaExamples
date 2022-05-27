public class TestClass_variable {

    String name_of_Class = "Class XII";
    int no_of_student = 56;

    public static void main (String[] args) { /*main method has to be static to make it runnable, since main should be
    independent of existing instances of that class */
        TestClass_variable tc = new TestClass_variable();
        System.out.println(tc.name_of_Class);
        System.out.println("Total no. of student: "+tc.no_of_student);
    }

    public void main() {
        System.out.println("name_of_Class");
        System.out.println("Total no. of student: "+no_of_student);
        /*Since main is not static, we don't need ref variable/object of class to
        call the class variables */

    }
}

