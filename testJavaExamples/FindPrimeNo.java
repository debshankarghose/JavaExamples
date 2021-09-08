import java.util.Scanner;

public class FindPrimeNo {
    static int number;
    static boolean isPrime = true;
    public static boolean checkPrime() {
        for (int i = 2; i <= number/2; i++) {
            int temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;  } }
        return isPrime; }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for check:");
        number = scan.nextInt();
        checkPrime();
        if (isPrime)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
    }
}
