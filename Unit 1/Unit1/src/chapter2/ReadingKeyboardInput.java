
/**
 * Riley Potts
 * Programming III AP CS A 
 * Reading Keyboard Input Examples
 * 9/16/2020
 */

import java.util.Scanner;

public class ReadingKeyboardInput {

    public static void main(String[] args) {
        //create Scanner object
        Scanner k = new Scanner(System.in);
        
        //reading keyboard input example
        int num;
        System.out.print("Please enter a number: ");
        num= k.nextInt();
        System.out.println("You entered the number "+ num);
        
        //keyboard input decimal example
        double num2;
        System.out.print("Please enter a number with a decimal: ");
        num2= k.nextDouble();
        System.out.println("You entered the number "+ num2);
        
        //keyboard input string example
        String name;
        System.out.print("Please enter your name: ");
        name= k.next();
        System.out.println("You name is "+ name);
        
        
    }

}
