package Customers;
import java.util.ArrayList;
import Menus.Menu;

public abstract class Customer implements Observer{
    // protected ArrayList<Ingredients> bannedFoods;

    String name;
    protected Menu menu;
    

//     protected ArrayList<String> MenuItems;

//     public void update(ArrayList<String> meals) {
//         MenuItems = meals;
//     }

    public abstract void getMenu();
    
}
