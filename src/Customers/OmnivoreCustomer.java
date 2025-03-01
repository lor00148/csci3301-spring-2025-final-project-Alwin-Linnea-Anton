package Customers;
public class OmnivoreCustomer extends Customer{
    @Override
    public void getMenu() {
        System.out.println("Menu for " + name + ":");
        for(int i = 0; i < menu.foods.size(); i++)
        {
            System.out.println(menu.foods.get(i));
        }
    }
}
