package Customers;
import java.util.ArrayList;

public abstract class Customer implements Observer{
    // protected ArrayList<Ingredients> bannedFoods;
    protected String[] excludedFoods;
    protected String[] preferences;
    protected ArrayList<String> MenuItems;

    public void update(ArrayList<String> meals) {
        MenuItems = meals;
    }

    public abstract void getMenu();
    
}
