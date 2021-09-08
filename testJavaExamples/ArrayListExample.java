import java.util.ArrayList; // importing the util package for the array list class is required.
import java.util.Collections; //import the collection class to sort the array list
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(); // Syntax for creating an arraylist of Strings
        //LinkedList<String> cars = new LinkedList<>(); We can use linkedList also here to store the value of cars.
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        System.out.println("Returning the array list: "+cars);
        System.out.println("Fetching a value from the arraylist by index:"+cars.get(0)); //fetching through an index value
        Collections.reverse(cars); //Reverse of the string entry in the arraylist
        System.out.println("Usage of Reverse: "+cars);
        Collections.sort(cars); //sorting the cars list
        for(String car:cars) { //looping through the array list
            System.out.println(car);
        }
        cars.clear(); //clear the ArrayList
        System.out.println(cars); //verify after the array list is cleared.
    }

}
