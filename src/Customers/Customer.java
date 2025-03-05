package Customers;
import java.util.ArrayList;
import Menus.Menu;

public abstract class Customer implements Observer{
    // protected ArrayList<Ingredients> bannedFoods;
    protected ArrayList<String> MenuItems;
    protected Menu menu;
    String name;

    public void update(ArrayList<String> meals) {
        MenuItems = meals;
    }

    public abstract void getMenu();
    
}
