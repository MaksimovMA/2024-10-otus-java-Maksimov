package homework;

import java.util.Deque;
import java.util.LinkedList;

public class CustomerReverseOrder {

    Deque<Customer> customers = new LinkedList<>();

    public void add(Customer customer) {
        customers.push(customer);
    }

    public Customer take() {
        return customers.pop();
    }
}
