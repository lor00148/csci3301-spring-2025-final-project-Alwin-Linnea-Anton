import java.util.ArrayList;

import Customers.Customer;
import Customers.CustomerFactory;
import Customers.CustomerTypes;
import Foods.FoodFactory;
import Foods.FoodTypes;
import Foods.OmnivoreFactory;
import Foods.Food;
import MenuSubject.MenuServer;

public class RestaurantThing {
    public static void main(String[] args) {
        MenuServer menuServer = new MenuServer();
        menuServer.notifyObservers();
        ArrayList<Food> foods = new ArrayList<>();
        FoodFactory factory = new OmnivoreFactory();
        foods.add(factory.makeFood(FoodTypes.Steak));
        foods.add(factory.makeFood(FoodTypes.Banana));
        menuServer.setMenu(foods);
        CustomerFactory customerFactory = new CustomerFactory();
        Customer John = customerFactory.makeCustomer(CustomerTypes.VEGAN, "John", menuServer);
        menuServer.notifyObservers();
        John.getMenu();
    }
}
