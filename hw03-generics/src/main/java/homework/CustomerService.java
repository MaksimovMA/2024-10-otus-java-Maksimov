package homework;

import java.util.*;
import java.util.Map.Entry;

public class CustomerService {

    private final TreeMap<Customer, String> customers = new TreeMap<>(Comparator.comparingLong(Customer::getScores));

    public Entry<Customer, String> getSmallest() {
        var smallestEntry = customers.firstEntry();
        return getCustomerStringEntry(smallestEntry);
    }

    public Entry<Customer, String> getNext(Customer customer) {
        var customerStringEntry = customers.higherEntry(customer);
        return getCustomerStringEntry(customerStringEntry);
    }

    private static Entry<Customer, String> getCustomerStringEntry(Entry<Customer, String> customerStringEntry) {
        return customerStringEntry != null
                ? new AbstractMap.SimpleEntry<>(new Customer(customerStringEntry.getKey()), customerStringEntry.getValue())
                : null;
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }
}
