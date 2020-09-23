
/**
 * Riley Potts
 * Programming III AP CS A 
 * Expressions And Assignment Statements
 * 11/14/2020
 */
public class ExpressionsAndAssignmentStatements {

    public static void main(String[] args) {
        /*
        this program calculates a sale price of an item that is regularly
        priced at $59, with a 20% discount subtracted.
        */
        
        double regularPrice = 59.0;
        double discount;
        double salePrice;
        
        //calculate the discount
        discount = regularPrice * .2;
        
        //calculate the sale price
        salePrice = regularPrice - discount;
        
        //display results
        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Sale Price: $" +salePrice);
        
    }

}
