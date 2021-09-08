import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(12);
            numbers.add(8);
            numbers.add(2);
            numbers.add(23);
            Iterator<Integer> it = numbers.iterator(); //Iterator is part of collection framework
            //Insead of loop, iterator is used to loop through the array list
            while(it.hasNext()) {
                Integer i = it.next();
                if(i < 10) {
                    it.remove();
                }
            }
            System.out.println(numbers);
        }
}
