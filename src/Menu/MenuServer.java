import java.util.ArrayList;

import Customers.Customer;

public class MenuServer implements Server {
    private ArrayList<Customer> customers;
    private ArrayList<String> menuItems;

    @Override
    public void registerObserver(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeObserver(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void notifyObservers() {
        for (Customer customer: customers) {
            customer.update(menuItems);
        }
    }

    public void addMeal(String meal) {
        menuItems.add(meal);
    }


    public void removeMeal(String meal) {
        menuItems.remove(meal);
    }
}
