package za.ac.cput.interfaces;

import za.ac.cput.domain.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements InterfaceCustomerRepository {

    private Set<Customer> customerDB = null;
    private static CustomerRepository repository = null;
    private CustomerRepository(){
        customerDB = new HashSet<Customer>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null){
            repository = new CustomerRepository();
        }
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer read(String s) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        return null;
    }

    @Override
    public Set<Customer> getAll() {
        return null;
    }

}