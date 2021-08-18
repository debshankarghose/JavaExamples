package InheritanceExample;

class SuperClassExample {
    protected String vehicleBrandName = "Ford";
    public void vehicleStructure(int no_Axle, int engine_Capacity,int no_wheels) {
        /*no_Axle = 2;
        engine_Capacity =1000;
        no_wheels = 4; */
        if(no_Axle==2) {
            if(engine_Capacity == 1000) {
                if (no_wheels == 4) {
                    System.out.println("This is a Class A vehicle");
                }
            }
        } else {
            System.out.println("This vehicle does not fall under the Class A vehicle and the brand/model listed");
        }
    }
}
