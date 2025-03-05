import Customers.*;

public class FoodPrepSimulator {
    public static void main(String args[]){
        CustomerFactory factory = new CustomerFactory();

        Customer omnivoreCustomer = factory.makeCustomer(CustomerTypes.OMNIVORE);
        String[] excludedList1 = {"Fish", "Nuts"};
        String[] prefrenceList1 = {"I don't like spicy food"};
        omnivoreCustomer = new ExcludedFoods(omnivoreCustomer, excludedList1);
        omnivoreCustomer = new Prefrences(omnivoreCustomer, prefrenceList1);
        omnivoreCustomer.getMenu();

        Customer vegetarianCustomer = factory.makeCustomer(CustomerTypes.VEGETARIAN);
        String[] excludedList2 = {"Milk"};
        String[] prefrenceList2 = {"I don't like salty food", "I don't like soup"};
        vegetarianCustomer = new ExcludedFoods(vegetarianCustomer, excludedList2);
        vegetarianCustomer = new Prefrences(vegetarianCustomer, prefrenceList2);
        vegetarianCustomer.getMenu();

        Customer veganCustomer = factory.makeCustomer(CustomerTypes.VEGAN);
        String[] excludedList3 = {"Nightshades"};
        String[] prefrenceList3 = {"I like my food spicy"};
        veganCustomer = new ExcludedFoods(veganCustomer, excludedList3);
        veganCustomer = new Prefrences(veganCustomer, prefrenceList3);
        veganCustomer.getMenu();


    }
}
