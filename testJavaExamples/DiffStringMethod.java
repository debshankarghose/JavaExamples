public class DiffStringMethod {
    public static void main(String[] args) {
        String stringVal = "Hello World";
        System.out.println(stringVal.toUpperCase()); //Converts the string to UPPER CASE
        System.out.println(stringVal.toLowerCase()); //Converts the string to lower case
        System.out.println(stringVal.indexOf("World")); //Returns the index of starting of the char 'W'
        System.out.println(stringVal.lastIndexOf("o")); //returns the last index of the char 'o'
        System.out.println(stringVal.concat(' '+stringVal)); //returns 'Hello World Hello World'
        System.out.println("Hello World to all my \"Java\" folks"); // \ allows to interpret "" within a string
        System.out.println("Hello\rWorld"); // Allows the second word in a string to be returned in next line.
        System.out.println(stringVal.split(stringVal)); // Splits the string

    }
}
