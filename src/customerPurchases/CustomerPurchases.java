package customerPurchases;
public class CustomerPurchases {

/* Customer Purchases class that contains a customerNumber, firstName, surname, 
product, price and quantity instance variables. */ 
    public int customerNumber;
    public String firstName;
    public String surname;
    public String product;
    public double price; 
    public int quantity; 
   
    public CustomerPurchases() {
    }
    
/* Setter and Getter methods to set and get the value of the instance variables above.*/  
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }   
}

