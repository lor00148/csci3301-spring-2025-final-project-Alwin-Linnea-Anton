package Customers;
public class OmnivoreCustomer extends Customer{
    @Override
    public void getMenu() {
        System.out.println("Menu for " + name + ":");
        for(int i = 0; i < menu.getFoods().size(); i++)
        {
            System.out.println(menu.getFoods().get(i));
        }
    }
}
