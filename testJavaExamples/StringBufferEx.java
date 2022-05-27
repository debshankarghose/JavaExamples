import java.util.Scanner;

public class StringBufferEx {
    public static <boolen> void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String input_string = scan.next();

        StringBuffer str = new StringBuffer(input_string); //StringBuffer is a mutable class.

        System.out.println("Enter the option to run");
        int entry_option = scan.nextInt();
        switch(entry_option) {
            case 1 -> {
                str.append(" "+"Ghose"); //add Ghose to input_string
                System.out.println(str);
                break;
            }
            case 2-> {
                StringBuffer str1 = new StringBuffer("Debshankar");
                //System.out.println(str.compareTo(str1)); //returns 0, because verifying the reference
                if(str.toString().equals(str1.toString())) {
                    /*
                    StringBuffer's equals method returns true only when a StringBuffer object is compared with itself.
                    It returns false when compared with any other StringBuffer, even if the two contain the same characters.
                    This is because "==" checks the reference equality and since both sb1 and sb2 are different object
                     references, so the output in this case is "false"
                     */
                    System.out.println("The string matches");
                }else {
                 System.out.println("The string match fails");
                }
                break;
            }
            case 3-> {
                StringBuffer str2 =str.delete(3,10);
                System.out.println("Pet name is returned: "+str2);
                break;
            }
            case 4-> {
                StringBuffer str3 = str.reverse();
                System.out.println("The reversed string is: "+str3);
                //System.out.println(str3.toString().compareToIgnoreCase(str.toString()));

                break;
            }
            case 5->{ //for cases, we can either use -> or :
                System.out.println(str.replace(0,10,"Deb"));
            break;
            }
            case 6->{
                System.out.println(str.insert(10,"Deb")); //insert string after debshankar
                break;
            }
            case 7->{
                System.out.println(str.charAt(0));
            }
            default-> {
                System.out.println("None of the Conditions can be verified");
            }
        }
        scan.close();
    }
}
