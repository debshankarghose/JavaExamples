import java.util.Scanner;

public class SwitchCaseExample {
    public void DayOfWeek(int day) {
        switch (day) {
            case 1 -> { //Either you can use -> or : when defining the cases
                System.out.println("Today is Monday");
                break;
            }
            case 2 -> {
                System.out.println("Today is Tuesday");
                break;
            }
            case 3 -> {
                System.out.println("Today is Wednesday");
                break;
            }
            case 4 -> {
                System.out.println("Today is Thursday");
                break;
            }
            case 5 -> {
                System.out.println("Today is Friday");
                break;
            }
            // if a day passed other than 1 to 5, IllegalException is captured.
            default -> throw new IllegalStateException("Day entered is not a weekday: " + day);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day:");
        int enterDay = scan.nextInt();
        SwitchCaseExample sc = new SwitchCaseExample();
        sc.DayOfWeek(enterDay);
    }

}
