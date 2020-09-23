
/**
 * Riley Potts
 * Programming III AP CS A 
 * Stock Transaction Program
 * 9/22/2020
 */
public class StockTransactionProgram {

    public static void main(String[] args) {
        //declare variables
        int stocks = 1000;
        double firstPrice = 32.87;
        double sellingPrice = 33.92;
        double stockBuyingPrice;
        double amountBrokerPaid;
        double amountBrokerPaid2;
        double stockSoldPrice;
        double profit;
        
        //calculate first buy & amount he owed the broker
        stockBuyingPrice = (stocks * firstPrice);
        amountBrokerPaid = stockBuyingPrice *.2;
        
        //calculate sell
        stockSoldPrice = (stocks * sellingPrice);
        amountBrokerPaid2 = stockSoldPrice * .2;
        
        //calculate profit
        profit = (stockSoldPrice - amountBrokerPaid) - (stockBuyingPrice -
                amountBrokerPaid2);
        
        //display information
        System.out.println("Joe paid $" + stockBuyingPrice + " for his "
                + "stock.");
        System.out.println("When he bought the stock, he paid his "
                + "broker $" + amountBrokerPaid);
        System.out.println("Joe sold the stock for $" + stockSoldPrice);
        System.out.println("When he sold the stock, he paid his "
                + "broker $" + amountBrokerPaid2);
        System.out.println("Joes total profit is $" + profit);
    }

}
