public class RecursionExample {
    //This is an example of recursion function where function is called within a function to achieve an argument.
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int i){
        if (i>0){
            return i+sum(i-1); /*Here, the sum is called as function within Function which calls the function itself
            to decrease i by 1 */
        } else {
            return i;
        }
    }

}
