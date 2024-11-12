package homework;

import java.util.*;
import java.util.Map.Entry;

public class CustomerService {

    private final TreeMap<Customer, String> customers = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Entry<Customer, String> getSmallest() {
        var smallestEntry = customers.firstEntry();

        return smallestEntry != null
                ? new AbstractMap.SimpleEntry<>(new Customer(smallestEntry.getKey()), smallestEntry.getValue())
                : null;
    }


    public Entry<Customer, String> getNext(Customer customer) {
        var customerStringEntry = customers.higherEntry(customer);
        return customerStringEntry != null
                ? new AbstractMap.SimpleEntry<>(new Customer(customerStringEntry.getKey()), customerStringEntry.getValue())
                : null;
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }
}
