package Customers;


public class Preferences extends CustomerDecorator{
    public Preferences(Customer customer, String preferences) {
        this.customer = customer;
        this.preferences = preferences;
    }

    public void getMenu() {
        customer.getMenu(); //Gets previous getMenu() outputs
        System.out.println("Customer Preferences: " + preferences); //Prints the customer Preferences
    }
}
