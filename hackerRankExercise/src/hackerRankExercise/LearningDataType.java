package hackerRankExercise;

import java.util.Scanner;

public class LearningDataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j;
        double e;
        String s1;
        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        e = scan.nextDouble();
        s1 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        i=i+j;
        System.out.println(i);
        /* Print the sum of the double variables on a new line. */
        d = d+e;
        System.out.println(d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        s1 = scan.nextLine();
        System.out.println(s+s1);
        scan.close();
    }
}
