import Customers.*;
import MenuSubject.MenuServer;

public class FoodPrepSimulatorTEST {
    public static void main(String args[]){
        CustomerFactory factory = new CustomerFactory();
        MenuServer menuServer = new MenuServer();

        Customer omnivoreCustomer = factory.makeCustomer(CustomerTypes.OMNIVORE, menuServer);
        omnivoreCustomer = new CustomerName(omnivoreCustomer, "Mav");
        omnivoreCustomer = new ExcludedFoods(omnivoreCustomer, "Fish, Nuts");
        omnivoreCustomer = new Preferences(omnivoreCustomer, "I don't like spicy food");
        omnivoreCustomer.getMenu();

        Customer vegetarianCustomer = factory.makeCustomer(CustomerTypes.VEGETARIAN, menuServer);
        vegetarianCustomer = new CustomerName(vegetarianCustomer, "Rain");
        vegetarianCustomer = new ExcludedFoods(vegetarianCustomer, "Milk");
        vegetarianCustomer = new Preferences(vegetarianCustomer,"I don't like salty food, I don't like soup");
        vegetarianCustomer.getMenu();

        Customer veganCustomer = factory.makeCustomer(CustomerTypes.VEGAN, menuServer);
        veganCustomer = new CustomerName(veganCustomer, "Skye");
        veganCustomer = new ExcludedFoods(veganCustomer, "Nightshades");
        veganCustomer = new Preferences(veganCustomer, "I like my food spicy");
        veganCustomer.getMenu();


    }
}
