import Customers.*;
import Foods.FoodFactory;
import Foods.FoodTypes;
import Foods.OmnivoreFactory;
import MenuSubject.*;

public class FoodPrepSimulatorTEST {
    public static void main(String args[]){
        CustomerFactory customerFactory = new CustomerFactory();
        MenuServer menuServer = new MenuServer();
        FoodFactory foodFactory = new OmnivoreFactory();

        // Creating our Menu
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Apple));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Eggs));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Banana));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Cheese));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Milk));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Pear));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Pork));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Ribs));
        menuServer.addItem(foodFactory.makeFood(FoodTypes.Steak));

        // Creating our customers
        Customer omnivoreCustomer = customerFactory.makeCustomer(CustomerTypes.OMNIVORE, menuServer);
        omnivoreCustomer = new CustomerName(omnivoreCustomer, "Mav");
        omnivoreCustomer = new ExcludedFoods(omnivoreCustomer, "Fish, Nuts");
        omnivoreCustomer = new Preferences(omnivoreCustomer, "I don't like spicy food");
        omnivoreCustomer.getMenu();

        Customer vegetarianCustomer = customerFactory.makeCustomer(CustomerTypes.VEGETARIAN, menuServer);
        vegetarianCustomer = new CustomerName(vegetarianCustomer, "Rain");
        vegetarianCustomer = new ExcludedFoods(vegetarianCustomer, "Milk");
        vegetarianCustomer = new Preferences(vegetarianCustomer,"I don't like salty food, I don't like soup");
        vegetarianCustomer.getMenu();

        Customer veganCustomer = customerFactory.makeCustomer(CustomerTypes.VEGAN, menuServer);
        veganCustomer = new CustomerName(veganCustomer, "Skye");
        veganCustomer = new ExcludedFoods(veganCustomer, "Nightshades");
        veganCustomer = new Preferences(veganCustomer, "I like my food spicy");
        veganCustomer.getMenu();


    }
}
