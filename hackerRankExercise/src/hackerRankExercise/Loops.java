package hackerRankExercise;

import java.util.Scanner;

public class Loops {
    private static  final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=0; i<=10; i++) {
            int result = n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
        sc.close();
    }
}
