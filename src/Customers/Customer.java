package Customers;
import java.util.ArrayList;

import Foods.Food;
import MenuSubject.MenuServer;
import Menus.Menu;

public abstract class Customer implements Observer{
    // protected ArrayList<Ingredients> bannedFoods;
    protected Menu menu = new Menu(null);
    protected String name;
    public MenuServer serverMenu;

    public Customer()
    {
    }
    public Customer(String name, MenuServer menuServer)
    {
        serverMenu = menuServer;
        this.name = name;

    }
    public void update(ArrayList<Food> meals) {
        this.menu.setFoods(meals);
    }

    public abstract void getMenu();

    public String getName()
    {
        return name;
    }
    
}
