package hackerRankExercise;

import java.util.Scanner;

public class ConditionalStatement {

    private static final Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the integer value:");
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if ((n % 2 == 0) && (n >= 2) && (n <= 5)) {
            System.out.println("Not Weird");
        } else if ((n % 2 == 0) && (n >= 6) && (n <= 20)) {
            System.out.println("Weird");
        } else if (n%2==0 && n>20) {
            System.out.println("Not Weird");
        }
        sc.close();

    }
}
