package za.ac.cput.interfaces;

import za.ac.cput.domain.Customer;

import java.util.Set;

public interface InterfaceCustomerRepository extends InterfaceRepository<Customer, String> {

    public Set<Customer> getAll();
}
