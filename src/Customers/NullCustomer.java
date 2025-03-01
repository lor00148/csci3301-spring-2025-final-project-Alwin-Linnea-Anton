package Customers;
//example of the signleton pattern
public class NullCustomer extends Customer {

    private static NullCustomer UNIQUE_INSTANCE = new NullCustomer();

    private NullCustomer() {

    }

    @Override
    public void getMenu() {
        System.out.println("ERROR: getMenu should never be called on NullCustomer");
    }
    
    public static NullCustomer getInstance() {
        return UNIQUE_INSTANCE;
    }
}