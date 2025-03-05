package Customers;
import Foods.Food;
public class VegetarianCustomer extends Customer{
    @Override
    public void getMenu() 
    {
        System.out.println("Menu for " + name + ":");
        if(menu.foods.type == "Vegetarian" || menu.foods.type == "Vegan")
            {
                System.out.println(menu.foods.get(i));
            }
    }
}
