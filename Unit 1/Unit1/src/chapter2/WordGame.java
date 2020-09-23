
/**
 * Riley Potts
 * Programming III AP CS A 
 * Word Game- Programming Challenge #16
 * 9/21/2020
 */
import java.util.Scanner;
         
public class WordGame {

    public static void main(String[] args) {
        //create Scanner
         Scanner k = new Scanner(System.in);
        //declare varibales
        String name;
        int age;
        String city;
        String college;
        String profession;
        String animal;
        String petName;
        
        //get informaton from user
        System.out.println("What is your name?");
        name = k.next();
        System.out.println("How old are you?");
        age = k.nextInt();
        System.out.println("Name a city.");
        city = k.next();
        System.out.println("Name a college.");
        college = k.next();
        System.out.println("Name a profession.");
        profession = k.next();
        System.out.println("Name an animal.");
        animal = k.next();
        System.out.println("What is your pets name?");
        petName = k.next();
        
        //display information
        System.out.println("There once was a person named " + name + " who lived"
                + "in " + city + ". At the age of " + age + ", " + name + 
                " graduated and went to work as a " + profession + ". Then, "
                        + name + " adopted a(an) " + animal + " named " +
                petName + ". They both lived happily ever after!");
    }

}
