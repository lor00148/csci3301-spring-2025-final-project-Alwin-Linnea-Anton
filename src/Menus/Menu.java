package Menus;
import Customers.Customer;
import Foods.Food;

import java.util.ArrayList;
public class Menu {
    protected ArrayList<Food> foods;
    protected Customer customer;

    public Menu(ArrayList<Food> foods, Customer Customer)
    {
        this.customer = customer;
        this.foods = foods;
    }
    public ArrayList<Food> getFoods()
    {
        return foods;
    }

}
