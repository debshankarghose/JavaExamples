public class TernaryOperationExample {
        public static void main(String[] args) {
        int x = 10;
        int y = 15;
        /*Ternary operator can replace the multiple lines of code,
        the syntax is String <identifier> = (condition) ? expressionTrue : expressionFalse
         */
        String greaterVal = (x>y)? " Value of x is greater": "Value of y is greater";
        System.out.println(greaterVal);

    }
}
