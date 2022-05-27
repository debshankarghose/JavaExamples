package JavaCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            list.add(i);
            //System.out.print(i + " "+"\n");
        }
        System.out.println(list);

        ListIterator<Integer> ltr = list.listIterator();
        System.out.println("Printing in forward direction");
        while(ltr.hasNext()) {
            System.out.print(ltr.next()+" ");
        }
        System.out.println();
        System.out.println("Printing in backward direction");
        while(ltr.hasPrevious()){   //using .hasPrevious a boolean method,if satisfied, prints reverse order of the list
            System.out.print(ltr.previous()+" ");
        }



    }
}
