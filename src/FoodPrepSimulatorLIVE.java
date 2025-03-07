import java.util.Scanner;

import Customers.*;
import Foods.FoodFactory;
import Foods.FoodTypes;
import Foods.OmnivoreFactory;
import MenuSubject.MenuServer;


public class FoodPrepSimulatorLIVE {
    public static void main(String args[]) {
        CustomerFactory factory = new CustomerFactory();
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Please enter Omnivore, Vegetarian, or Vegan");
        CustomerTypes customerType = CustomerTypes.valueOf(scanner.nextLine().toUpperCase());
        Customer newCustomer = factory.makeCustomer(customerType, menuServer);

        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        newCustomer = new CustomerName(newCustomer, name);
        
        System.out.println("Please enter any food allergies, if none please enter None (Please separate them using commas)");
        String excludedFoods = scanner.nextLine();
        newCustomer = new ExcludedFoods(newCustomer, excludedFoods);

        System.out.println("Please enter any food preferences, if none please enter None (Please separate them using commas)");
        String preferences = scanner.nextLine();
        newCustomer = new Preferences(newCustomer, preferences);

        System.out.println();
        
        newCustomer.getMenu();
        scanner.close();
    }
}
