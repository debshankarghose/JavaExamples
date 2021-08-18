import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        /* Here looking for a patter java, Pattern.CASE_INSENSITIVE is a flag, to ignore from the match if java is in Uppercase.
         */
        Matcher myMatcher = myPattern.matcher("Hello java world"); //looks for a match in the pattern passed in the argument
        boolean matchFound = myMatcher.find(); //find() will return true or false based on the match
        if(matchFound) {
            System.out.println("Match found!");
        } else {
            System.out.println("Could not find a match!");
        }
    }
}
