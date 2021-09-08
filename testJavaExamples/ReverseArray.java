import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {10, 15, 20, 30}; // Integer is class within java lang used for collections.
        reverse(arr);
        System.out.println("=============");
        //int[] arr = {10,15, 20, 30}; //int is a primitive data type used for reversing through Java arrays.
        //ReverseArray obj = new ReverseArray();
        //obj.rev(arr);
    }

    static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Using Java Collections:"+Arrays.asList(myArray));
    }

    public void rev(int[] array) {
      int len = array.length;
      int[] revArray = new int[len];
      for(int i=3;i>=0;i--){

          revArray[i] = array[i];
          System.out.print(revArray[i] + " ");
        }
    }
}