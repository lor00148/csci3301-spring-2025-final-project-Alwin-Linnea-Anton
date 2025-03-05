package Customers;
import MenuSubject.MenuServer;
public class CustomerFactory {
    
    public Customer makeCustomer(CustomerTypes customerType, String name, MenuServer menuServer) {
        if(customerType == CustomerTypes.OMNIVORE){
            return new OmnivoreCustomer(name, menuServer);
        } else if (customerType == CustomerTypes.VEGAN) {
            return new VeganCustomer(name, menuServer);
        } else if (customerType == CustomerTypes.VEGETARIAN) {
            return new VegetarianCustomer(name, menuServer);
        } else {
            System.out.println("error getting correct customer- returning NullCustomer");
            return NullCustomer.getInstance();
        } 
    }
}