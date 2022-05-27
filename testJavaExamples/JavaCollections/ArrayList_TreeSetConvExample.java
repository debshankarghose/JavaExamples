package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArrayList_TreeSetConvExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(); // Syntax for creating an arraylist of Strings
        //LinkedList<String> cars = new LinkedList<>(); We can use linkedList also here to store the value of cars.
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Acura");
        cars.add("Lexus");
        cars.add("Infinity");
        cars.add("Tesla");
        cars.add("Cadillac");
        System.out.println("Returning the array list: "+cars);
        System.out.println("Fetching a value from the arraylist by index:"+cars.get(0)); //fetching through an index value
        Collections.reverse(cars); //Reverse of the string entry in the arraylist
        System.out.println("Usage of Reverse: "+cars);
        Collections.sort(cars); //sorting the cars list
        for(String car:cars) { //looping through the array list
            System.out.println(car);
        }
        //Using Tree set to sort the ArrayList
        TreeSet tset = new TreeSet(cars);
        System.out.println("Printing the cars array list ina treeset: "+tset);

        List<String> sub_cars = new ArrayList<String>();
        sub_cars= cars.subList(2,4); /*Had to typecast to ArrayList since using the method subList
                                                            from list interface */
        System.out.println("Printing the filtered car brands from subList: "+sub_cars);

        sub_cars.clear();
        cars.clear(); //clear the ArrayList
        System.out.println(cars); //verify after the array list is cleared.
    }

}
