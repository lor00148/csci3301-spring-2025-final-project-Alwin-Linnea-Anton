package Customers;
public class VeganCustomer extends Customer {

    @Override
    public void getMenu() {
        System.out.println("Menu for " + name + ":");
        for(int i = 0; i < menu.foods.size(); i++)
        {
            if(menu.foods.type == "Vegan")
            {
                System.out.println(menu.foods.get(i));
            }
        }
    }
    
}
