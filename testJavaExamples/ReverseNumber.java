public class ReverseNumber {
    public static void main(String[] args){
        int num = 235;
        int rev =0;
        while(num!=0){
            int rem = num%10; //here rem =5
            rev = rev*10+rem;
            num =num/10;// here num is modified to the quotient value i.e. 23
        }
        System.out.println(rev);
    }
}
