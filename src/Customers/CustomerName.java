package Customers;


public class CustomerName extends CustomerDecorator{
    private String name;

    public CustomerName(Customer customer, String name) {
        this.customer = customer;
        this.name = name;
    }

    public void getMenu() {
        System.out.println("Menu for " + this.name + ":");
        customer.getMenu();
        
    }

}
