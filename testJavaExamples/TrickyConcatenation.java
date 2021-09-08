public class TrickyConcatenation {
    public static void main(String[] args) {
        int a =100;
        int b=200;
        String word1 = "Hello";
        String word2 = "Team";
        System.out.println(a+b); //returns sum of a and b = 300
        System.out.println(word1+" "+word2);// return both the string concatenated "Hello Team"
        System.out.println(a+b+word1+word2); //returns 300HelloTeam
        System.out.println(word1+word2+a+b); //returns Hello Team100200

        /* This is because the execution begin from left to right and once jvm reads Strings, it treats int value as string
        as well */

    }
}
