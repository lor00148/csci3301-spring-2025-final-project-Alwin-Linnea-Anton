package Customers;

import java.util.Arrays;

public class ExcludedFoods extends CustomerDecorator{
    public ExcludedFoods(Customer customer, String[] excludedFoods) {
        this.customer = customer;
        this.excludedFoods = excludedFoods;
    }

    public void getMenu() {
        customer.getMenu();
        System.out.println("Excluded Foods: " + Arrays.toString(excludedFoods));
    }
}
