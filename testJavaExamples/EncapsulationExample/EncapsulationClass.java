package EncapsulationExample;

public class EncapsulationClass {
    private String name; //private modifier used for the string name to encapsulate in this class.
    //getter
    public String getName(){
        return name; // to access the name variable from another class getter method is created.
    }
    //setter
    public String setName(String newName){
        this.name = newName; //to access name outside of this class, and modify the value, setter method is created.
        return newName;
    }
}
