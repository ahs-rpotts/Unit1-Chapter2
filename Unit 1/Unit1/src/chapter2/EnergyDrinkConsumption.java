
/**
 * Riley Potts
 * Programming III AP CS A 
 * Energy Drink Consumption- Programming Challenge #15
 * 9/21/2020
 */
public class EnergyDrinkConsumption {

    public static void main(String[] args) {
        //declare varibles
        int customers = 12467;
        double drinksPerWeek = 0.14;
        double citrusDrinks = 0.64;
        double approxPerWeek;
        double approxCitrus;
        
        //calcuate approx drinks per week & citrus 
        approxPerWeek = customers * drinksPerWeek;
        approxCitrus = approxPerWeek * citrusDrinks;
        
        //display information
        System.out.println("The approximate amount of people who purchase one "
                + "or more energy drinks a week is " + approxPerWeek);
        System.out.println("The approximate amount of people who prefer citrus"
                + "flavored drinks is " + approxCitrus);
    }

}
