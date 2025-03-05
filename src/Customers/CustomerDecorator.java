package Customers;

public abstract class CustomerDecorator extends Customer {
    protected Customer customer;
    public abstract void getMenu();
}