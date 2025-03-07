package Customers;


public class ExcludedFoods extends CustomerDecorator{
    public ExcludedFoods(Customer customer, String excludedFoods) {
        this.customer = customer;
        this.excludedFoods = excludedFoods;
    }

    public void getMenu() {
        customer.getMenu(); // Since getMenu() returns void, we call getMenu() to get previous print statements
        System.out.println("Excluded Foods: " + excludedFoods); // Then we print Excluded foods
    }
}
