package Customers;

import MenuSubject.MenuServer;

public class OmnivoreCustomer extends Customer{
    

    public OmnivoreCustomer(MenuServer serverMenu)
    {
        super(serverMenu);
        this.serverMenu.registerObserver(this);
    }
    @Override
    public void getMenu() {
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            System.out.println(menu.getFoods().get(i));
        }
    }
}
