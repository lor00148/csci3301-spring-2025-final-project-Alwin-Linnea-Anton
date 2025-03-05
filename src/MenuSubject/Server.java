package MenuSubject;

import Customers.Customer;

public interface Server {

    public void registerObserver(Customer customer);
    public void removeObserver(Customer customer);
    public void notifyObservers();

}
