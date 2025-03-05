import Customers.*;

public class FoodPrepSimulatorTEST {
    public static void main(String args[]){
        CustomerFactory factory = new CustomerFactory();

        Customer omnivoreCustomer = factory.makeCustomer(CustomerTypes.OMNIVORE);
        omnivoreCustomer = new CustomerName(omnivoreCustomer, "Mav");
        omnivoreCustomer = new ExcludedFoods(omnivoreCustomer, "Fish, Nuts");
        omnivoreCustomer = new Preferences(omnivoreCustomer, "I don't like spicy food");
        omnivoreCustomer.getMenu();

        Customer vegetarianCustomer = factory.makeCustomer(CustomerTypes.VEGETARIAN);
        vegetarianCustomer = new CustomerName(vegetarianCustomer, "Rain");
        vegetarianCustomer = new ExcludedFoods(vegetarianCustomer, "Milk");
        vegetarianCustomer = new Preferences(vegetarianCustomer,"I don't like salty food, I don't like soup");
        vegetarianCustomer.getMenu();

        Customer veganCustomer = factory.makeCustomer(CustomerTypes.VEGAN);
        veganCustomer = new CustomerName(veganCustomer, "Skye");
        veganCustomer = new ExcludedFoods(veganCustomer, "Nightshades");
        veganCustomer = new Preferences(veganCustomer, "I like my food spicy");
        veganCustomer.getMenu();


    }
}
