package Customers;
import java.util.ArrayList;

public abstract class Customer {
    // protected ArrayList<Ingredients> bannedFoods;
    protected String[] excludedFoods;
    protected String[] preferences;

    public abstract void getMenu();
    
}
