public class CustomerFactory {
    
    public Customer makeCustomer(CustomerTypes customerType) {
        if(customerType == CustomerTypes.OMNIVORE){
            return new OmnivoreCustomer();
        } else if (customerType == CustomerTypes.VEGAN) {
            return new VeganCustomer();
        } else if (customerType == CustomerTypes.VEGETARIAN) {
            return new VegetarianCustomer();
        } else {
            System.out.println("error getting correct customer- returning NullCustomer");
            return NullCustomer.getInstance();
        } 
    }
}