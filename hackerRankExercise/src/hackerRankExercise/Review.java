package hackerRankExercise;
//This program separates the even and odd chars from a string.
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string");
        int T = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter the String");
        String str[] = new String[T];
        for (int i = 0; i < T; i++) {
            str[i] = sc.next();
            char[] arr = str[i].toCharArray();
            StringBuilder strEven = new StringBuilder();
            StringBuilder strOdd = new StringBuilder();

            for (int j = 0; j < arr.length; j++) {
                if (j % 2 == 0) {
                    strEven.append(arr[j]);
                } else {
                    strOdd.append(arr[j]);
                }
            }
            System.out.println(strEven);
            System.out.println(" " + strOdd);
        }
    }
}