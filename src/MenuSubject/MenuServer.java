package MenuSubject;

import java.util.*;

import Customers.Customer;

import Foods.Food;
public class MenuServer implements Server {
    private List<Customer> customers;
    private ArrayList<Food> menuItems;
    
    public MenuServer()
    {
        customers = new ArrayList<Customer>();
    }
    @Override
    public void registerObserver(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void removeObserver(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyObservers() {
        for (Customer customer : customers) {
            customer.update(menuItems);
        }
    }
    public void menuChanged() {
		notifyObservers();
	}
	
	public void setMenu(ArrayList<Food> foods) {
		this.menuItems = foods;
		menuChanged();
	}
}
