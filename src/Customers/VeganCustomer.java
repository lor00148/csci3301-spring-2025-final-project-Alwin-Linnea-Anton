package Customers;

import Foods.Food.FoodCategory;
import MenuSubject.MenuServer;

public class VeganCustomer extends Customer {

    public VeganCustomer(String name, MenuServer serverMenu)
    {
        super(name, serverMenu);
        this.serverMenu.registerObserver(this);
    }


    @Override
    public void getMenu() {
        System.out.println("Menu for " + getName() + ":");
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            if(menu.getFoods().get(i).getCategory() == FoodCategory.Vegan)
            {
                System.out.println(menu.getFoods().get(i));
            }
        }
    }
    
}
