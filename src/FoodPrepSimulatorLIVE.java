import java.util.Scanner;

import Customers.*;


public class FoodPrepSimulatorLIVE {
    public static void main(String args[]) {
        CustomerFactory factory = new CustomerFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Omnivore, Vegetarian, or Vegan");
        CustomerTypes customerType = CustomerTypes.valueOf(scanner.nextLine().toUpperCase());
        Customer newCustomer = factory.makeCustomer(customerType);

        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        newCustomer = new CustomerName(newCustomer, name);
        
        System.out.println("Please enter any food allergies, if none please enter None (Please separate them using commas)");
        String excludedFoods = scanner.nextLine();
        newCustomer = new ExcludedFoods(newCustomer, excludedFoods);

        System.out.println("Please enter any food preferences, if none please enter None (Please separate them using commas)");
        String preferences = scanner.nextLine();
        newCustomer = new Preferences(newCustomer, preferences);
        
        newCustomer.getMenu();
        scanner.close();
    }
}
