public class DoWhileLoopValidation {
    public static void main(String[] args){
        int i =0; /*Variable i needs to be initialised outside the do-while loop else, if passed in 'do',it'll return error
        for while and if declared outside do-while loop, but initialised in do-loop, the loop will not increment.
        */
        do {
            System.out.println("Value of i: "+i);
            i++;
        } while (i<5);
    }
}
