
/**
 * Riley Potts
 * Programming III AP CS A 
 * string method examples
 * 9/16/2020
 */
import java.util.Scanner;

public class StringMethodExamples {

    public static void main(String[] args) {
        //create Scanner object
        Scanner k = new Scanner(System.in);
        //declare variables
        String name;
        int nameLength;
        char firstLetter;
        char lastLetter;
        
        //ask for user name
        System.out.println("What is your name? ");
        name = k.next();
        
        //toUppercase ex
        System.out.println("This is your name in ALL CAPS: "
                +name.toUpperCase());
        
        //toLowerCase ex
        System.out.println("this is your name in all lowercase: " +
                name.toLowerCase());
        
        //charAt ex
        firstLetter = name.charAt(0);
        lastLetter = name.charAt(name.length()-1);
        System.out.println("The first letter of your name is: "
                + firstLetter);
        System.out.println("The last letter of your name is: " 
        +lastLetter);
        
        //length method ex
        nameLength = name.length();
        System.out.println("Your name has " + nameLength
        + " letters in it.");
    }

}


