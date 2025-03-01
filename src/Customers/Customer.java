package Customers;
import java.util.ArrayList;
import Menus.Menu;

public abstract class Customer {
    // protected ArrayList<Ingredients> bannedFoods;
    String name;
    protected Menu menu;
    
    public abstract void getMenu();
    
}
