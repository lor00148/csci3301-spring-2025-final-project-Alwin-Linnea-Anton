package Customers;

import MenuSubject.MenuServer;

public class OmnivoreCustomer extends Customer{
    

    public OmnivoreCustomer(String name, MenuServer serverMenu)
    {
        super(name, serverMenu);
        this.serverMenu.registerObserver(this);
    }
    @Override
    public void getMenu() {
        System.out.println("Menu for " + getName() + ":");
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            System.out.println(menu.getFoods().get(i));
        }
    }
}
