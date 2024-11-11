package homework;

import java.util.*;
import java.util.Map.Entry;

public class CustomerService {

    private final TreeMap<Customer, String> customers = new TreeMap<>();

    public Entry<Customer, String> getSmallest() {
        return customers.entrySet().stream()
                .min(Entry.comparingByKey())
                .map(entry -> new AbstractMap.SimpleEntry<>(new Customer(entry.getKey()), entry.getValue()))
                .orElse(null);
    }

    public Entry<Customer, String> getNext(Customer customer) {
        Entry<Customer, String> customerStringEntry = customers.higherEntry(customer);
        return customerStringEntry != null
                ? new AbstractMap.SimpleEntry<>(new Customer(customerStringEntry.getKey()), customerStringEntry.getValue())
                : null;
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }
}
