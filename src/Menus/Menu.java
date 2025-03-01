package Menus;
import Customers.Customer;

import java.util.ArrayList;
public class Menu {
    protected ArrayList<Food> foods;
    protected Customer customer;

    public Menu(ArrayList<Food> foods, Customer Customer)
    {
        this.customer = customer;
        this.foods = foods;
    }

}
