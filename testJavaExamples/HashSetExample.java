import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Buick");
        cars.add("BMW");
        cars.add("Cadillac");
        cars.add("Dodge");
        for(String car: cars) {
            System.out.println(car); /*Note HashSet does not sort the values while returning and
            remove the duplicate value "BMW". */
        }

    }
}
