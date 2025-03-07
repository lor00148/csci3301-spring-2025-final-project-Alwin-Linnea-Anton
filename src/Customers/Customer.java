package Customers;
import java.util.ArrayList;

import Foods.Food;
import MenuSubject.MenuServer;
import Menus.Menu;

public abstract class Customer implements Observer{

    protected Menu menu;
    protected String excludedFoods; // For Decorator
    protected String preferences; // For Decorator
    public MenuServer serverMenu;

    public Customer()
    {
    }
    public Customer(MenuServer menuServer)
    {
        serverMenu = menuServer;
        menu = new Menu(serverMenu.getMenuItems());

    }

    public void update(ArrayList<Food> meals) {
        this.menu.setFoods(meals);
    }

    public abstract void getMenu();

    
}
