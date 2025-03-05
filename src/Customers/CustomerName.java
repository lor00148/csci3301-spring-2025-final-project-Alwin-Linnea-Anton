package Customers;


public class CustomerName extends CustomerDecorator{
    public CustomerName(Customer customer, String name) {
        this.customer = customer;
        this.name = name;
    }

    public void getMenu() {
        customer.getMenu();
        System.out.println("\n" + name);
    }

}
