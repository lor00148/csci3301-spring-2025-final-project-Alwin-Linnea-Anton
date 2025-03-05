package Customers;

import java.util.Arrays;

public class Prefrences extends CustomerDecorator{
    public Prefrences(Customer customer, String[] prefrences) {
        this.customer = customer;
        this.preferences = prefrences;
    }

    public void getMenu() {
        customer.getMenu();
        System.out.println("Customer Prefrences: " + Arrays.toString(preferences));
    }
}
