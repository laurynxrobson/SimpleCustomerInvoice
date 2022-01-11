package printing;
import java.text.DecimalFormat;

import customerPurchases.CustomerPurchases;
public class Printing {
    /* This is the printing details method that is used to display the details that the user entered. 
    The method contains the info.get() method that gets the inputs that were set from the get method.*/
    public static void printingDetails(CustomerPurchases info){
        
        System.out.println("CUSTOMER INVOICE: ");
        System.out.println("**************************");
        System.out.println("CUSTOMER NUMBER:\t" + info.getCustomerNumber());
        System.out.println("CUSTOMER FIRST NAME:\t" + info.getFirstName());
        System.out.println("CUSTOMER SURNAME:\t" + info.getSurname());
        System.out.println("PRODUCT PRICE: \t\t" + "R "+ info.getPrice());
        System.out.println("PRODUCT QUANTITY:\t" + info.getQuantity());
        System.out.println("**************************");
    } 
    public static void customerPurchaseReport(CustomerPurchases info){
        /* Decimal format class formats the amounts in the report to have double digits in the end. */
        DecimalFormat df = new DecimalFormat("#.00");
        /* Variables declared, amounts are rounded and the price enter by the user is called and calculations are done to work out the tax, commission, discount and total.*/
        double tax = (Math.round(info.getPrice()* (15.0 / 100)));
        double commission = Math.round(info.getPrice()*(8.5 / 100));
        double discount = Math.round(info.getPrice()*(10.0 / 100));
        double total = Math.round((info.getPrice() + tax) - (discount + commission)); 

        System.out.println("CUSTOMER PURCHASE REPORT");
        System.out.println("**************************");
        /* Displays the price of the product and the tax, commission, discount and total that was calculated above. */
        System.out.println("PRODUCT PRICE:\t\t" + "R " + df.format(info.getPrice()));
        System.out.println("TAX:\t\t\t" + "R " + df.format(tax));
        System.out.println("COMMISSION:\t\t" + "R " + df.format(commission));
        System.out.println("DISCOUNT:\t\t" + "R " + df.format(discount));
        System.out.println("TOTAL:\t\t\t" + "R " + df.format(total));
        System.out.println("**************************");
    } 
}