package hackerRankExercise;
import java.io.*;
import java.util.Scanner;

public class ConstructionClassInstance {
    private int age;

    public ConstructionClassInstance(int initialAge) {
        //Add some more code to run some checks on initialAge

        if (initialAge > 0) {;
        this.age = initialAge;
    } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }
    }
    public void amIOld() {
        if (age<13) {
            System.out.println("You are young");
        } else if((age>=13 && age <18)) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are old");
        }
    }

    public void yearPasses() {
        //Increment this person's age.
        age =age+1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=0;i<T; i++) {
            int age = s.nextInt();
            ConstructionClassInstance p = new ConstructionClassInstance(age);
            p.amIOld();
            for(int j=0; j<3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        s.close();
    }
}

