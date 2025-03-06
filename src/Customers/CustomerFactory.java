package Customers;
import MenuSubject.MenuServer;
public class CustomerFactory {
    
    public Customer makeCustomer(CustomerTypes customerType, MenuServer menuServer) {
        if(customerType == CustomerTypes.OMNIVORE){
            return new OmnivoreCustomer(menuServer);
        } else if (customerType == CustomerTypes.VEGAN) {
            return new VeganCustomer(menuServer);
        } else if (customerType == CustomerTypes.VEGETARIAN) {
            return new VegetarianCustomer(menuServer);
        } else {
            System.out.println("error getting correct customer- returning NullCustomer");
            return NullCustomer.getInstance();
        } 
    }
}