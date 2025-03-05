package Customers;


public class ExcludedFoods extends CustomerDecorator{
    public ExcludedFoods(Customer customer, String excludedFoods) {
        this.customer = customer;
        this.excludedFoods = excludedFoods;
    }

    public void getMenu() {
        customer.getMenu(); //Gets previous getMenu() outputs
        System.out.println("Excluded Foods: " + excludedFoods); //Prints the excluded foods
    }
}
