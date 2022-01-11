package Main;
/* Importing the scanner class. */
import java.util.Scanner;
// Importing the customerPurchases class
 import customerPurchases.CustomerPurchases;
/* Importing the printing class. */
 import printing.Printing;
/* Main class that prompts the user the enter the customer purchase details and calls 
the printingDetails and the customer purchase report.*/
public class Main {
    public static void main(String[] args) {
        /* Scanner object called input that will ask the user to type the customer details.*/
        Scanner input = new Scanner(System.in);
        /* Customer Purchases called getPurchases that imports the set and get methods in the customer purchases class. */
        CustomerPurchases getPurchases = new CustomerPurchases();
        /* This is a print method that prints out a message to the user. */
        System.out.print("Enter the customer number >> ");
        /* Collects the user's input number from the scanner. */
        int number = input.nextInt();
        /* Takes the user's input that was enter into the scanner and sets it to the customer number.*/
        getPurchases.setCustomerNumber(number);

        System.out.print("Enter the customer first name >> ");
        String fName = input.next();
       getPurchases.setFirstName(fName);

        System.out.print("Enter the customer surname >> ");
        String lastName = input.next();        
       getPurchases.setSurname(lastName);

        System.out.print("Enter the product >> ");
        String productName = input.next();
       getPurchases.setProduct(productName);

        System.out.print("Enter the product price >> ");
        double productPrice = input.nextDouble();
       getPurchases.setPrice(productPrice);

        System.out.print("Enter the quantity required >> ");
        int productQuantity = input.nextInt();
       getPurchases.setQuantity(productQuantity);

        System.out.println(" ");
        /* The printing details method is called to display the printing details that the user entered from the scanner.  */
        Printing.printingDetails(getPurchases);

        System.out.println(" ");
        
        System.out.println("Would you like to view the product report? Enter (1)");
        System.out.println("to view the purchase report or any other key to exit.");

        System.out.println(" ");
        int x = input.nextInt();
        /* The if statement will display the customer purchase report if the user enters 1, if the user enters other values besides 1 the report will not display. */
        if (x == 1){ 
            Printing.customerPurchaseReport(getPurchases); 
        }
        else 
        {

        }

        System.out.println("Application Complete");

        System.out.println(" ");
    }
    
}
