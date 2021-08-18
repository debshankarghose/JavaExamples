package InheritanceExample;

class SubCassExample extends SuperClassExample { //extends allows to inherit the Superclass and it's method.
    public static void main(String[] args) {
        String modelName = "Mustang";
        SubCassExample myCar = new SubCassExample();
        myCar.vehicleStructure(1,900,2);
        System.out.println("\n");
        System.out.println("The vehicle details is verified");
        System.out.println("The default vehicle brand is: "+myCar.vehicleBrandName +" and the model name is: "+modelName);
    }

}
