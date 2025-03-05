package Customers;

import Foods.Food.FoodCategory;

public class VeganCustomer extends Customer {

    @Override
    public void getMenu() {
        System.out.println("Menu for " + name + ":");
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            if(menu.getFoods().get(i).getCategory() == FoodCategory.Vegan)
            {
                System.out.println(menu.getFoods().get(i));
            }
        }
    }
    
}
