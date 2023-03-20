package za.ac.cput.interfaces;

import za.ac.cput.domain.CustomerOrder;

import java.util.*;

public class CustomerOrderRepository implements InterfaceCustomerOrdersRepository{

    private Set<CustomerOrder> customerOrderDB = null;
    private static CustomerOrderRepository repository = null;
    private CustomerOrderRepository(){
        customerOrderDB = new HashSet<CustomerOrder>();
    }

    public static CustomerOrderRepository getRepository(){
        if(repository == null){
            repository = new CustomerOrderRepository();
        }
        return repository;
    }

    @Override
    public CustomerOrder create(CustomerOrder customer) {
        return null;
    }

    @Override
    public CustomerOrder read(String s) {
        return null;
    }

    @Override
    public CustomerOrder update(CustomerOrder customer) {
        return null;
    }

    @Override
    public CustomerOrder delete(CustomerOrder customer) {
        return null;
    }


    @Override
    public Set<CustomerOrder> getAll() {
        return null;
    }

}
