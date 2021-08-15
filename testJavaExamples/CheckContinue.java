public class CheckContinue {
    public static void main(String[] args){
        for(int i=0; i<10; i++) {
            if(i==4) { System.out.println("Purposefully missing the iterations");
                continue; // Continue is going to miss iteration 4
            }
            System.out.println(i);
        }
    }
}
