package hackerRankExercise;

import java.util.Scanner;

public class Operator {

    static void solve(double meal_cost, int tip_percent, int tax_percent)
    {

    }
    private static  final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        /*  \r\n is a Windows line ending.
        \n is a UNIX line ending.
        \r is a Macintosh (pre-OSX) line ending.
        \u2028 is LINE SEPARATOR.
        \u2029 is PARAGRAPH SEPARATOR.
        \u0085 is NEXT LINE (NEL). */

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
