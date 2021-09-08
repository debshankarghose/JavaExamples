import java.util.HashMap;
/*
Hashmap have the data placed in the container in sorted manner
 */
public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, String> cities = new HashMap<>();
        cities.put("India", "New Delhi");
        cities.put("America", "Washington DC");
        cities.put("England", "London");
        System.out.println(cities);
        for(String city: cities.keySet()) { /*Note: for HasMap, using forEach loop, .keySet needs to be call to traverse
         through the hashmap. */
            if(city.contains("England")) {
                System.out.println("Will not print the city -- London");
                System.out.println(city);
                }
        }

    }
}
