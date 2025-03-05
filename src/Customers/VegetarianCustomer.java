package Customers;

import Foods.Food.FoodCategory;

public class VegetarianCustomer extends Customer{
    @Override
    public void getMenu() 
    {
        System.out.println("Menu for " + name + ":");
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            if(menu.getFoods().get(i).getCategory() == FoodCategory.Vegan || menu.getFoods().get(i).getCategory() == FoodCategory.Vegetarian)
            {
                System.out.println(menu.getFoods().get(i));
            }
        }
    }
}
