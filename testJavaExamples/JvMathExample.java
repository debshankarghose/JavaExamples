import java.util.stream.IntStream;

public class JvMathExample {
    private static int[] arry; //no correction required as per review commit
    private int myIntVal1 = 24;
    private int myIntVal2 = 38;

    public static void main(String[] args) {
        arry = new int[]{5, 10, 35, 100};
        JvMathExample m = new JvMathExample(); //Creating a constructor of the class
        get_maxVal(m.arry);
        min_max_value_from_2_integer(m.myIntVal1, m.myIntVal2);
        System.out.println("===============================================");
        long rand = (long)(Math.random() * 999); //random no generation between 999
        System.out.println("Random no generated is: "+rand);


    }
     public static void min_max_value_from_2_integer(int a, int b){
        int val1 = Math.min(a, b); // pulling the min value between two integers
        int val2 = Math.max(a,b); //pulling the max value between two integers
        System.out.println("===============================================");
        System.out.println("Calling the method for min and max value between two integers");
        System.out.println("Value of max: "+val2);
        System.out.println("Value of min: "+val1);
    }
    static void get_maxVal(int[] arr) {
        int maxV = IntStream.of(arr).max().orElse(Integer.MAX_VALUE); // IntStream can pull the max among the integers in an array
        int minV = IntStream.of(arr).min().orElse(Integer.MIN_VALUE); // IntStream can pull the min among the integers in an array
        System.out.println("Max value of an array is "+maxV);
        System.out.println("Max value of an array is "+minV);
    }


}
