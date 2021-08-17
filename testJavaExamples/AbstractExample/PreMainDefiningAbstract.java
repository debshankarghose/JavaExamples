package AbstractExample;

abstract class PreMainDefiningAbstract { //abstract class is defined
    public String fname = "John";
    public String lname = "Doe";
    abstract void student(); //abstract method can only be defined in an abstract class.
}

class StudentDetails extends PreMainDefiningAbstract { //here StudentDetails class is extending to abstract class.
    public String schoolName = "St Patricks";
    public void student() {
        System.out.println("All students by default will show up in this school");
        }
}
