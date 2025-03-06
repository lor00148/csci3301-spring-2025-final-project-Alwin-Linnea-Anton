package Customers;

import Foods.Food.FoodCategory;
import MenuSubject.MenuServer;

public class VegetarianCustomer extends Customer{

    public VegetarianCustomer(MenuServer serverMenu)
    {
        super(serverMenu);
        this.serverMenu.registerObserver(this);
    }


    @Override
    public void getMenu() 
    {
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            if(menu.getFoods().get(i).getCategory() == FoodCategory.Vegan || menu.getFoods().get(i).getCategory() == FoodCategory.Vegetarian)
            {
                System.out.println(menu.getFoods().get(i));
            }
        }
    }
}
