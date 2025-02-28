public class CustomerFactory {
    
    public Customer makeCustomer(String CustomerType) {
        if(CustomerType == "omnivore"){
            return new OmnivoreCustomer();
        } else if (CustomerType == "vegan") {
            return new VeganCustomer();
        } else if (CustomerType == "Vegetarian") {
            return new VegetarianCustomer();
        } else {
            System.out.println("error getting correct customer- returning NullCustomer");
            return NullCustomer.getInstance();
        } 
    }
}