package EncapsulationExample;

public class Main {
    public static void main(String[] args){
        EncapsulationClass obj = new EncapsulationClass(); /*obj is constructed for the Encapsulation class within the same
        package */
        obj.setName("John"); //John is passed to the newName which in turn is tied to String name
        System.out.println("To get the name, we need to call getMethod: "+obj.getName());
    }
}
