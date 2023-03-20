package za.ac.cput.interfaces;

import za.ac.cput.domain.CustomerOrder;

import java.util.Set;

public interface InterfaceCustomerOrdersRepository extends InterfaceRepository<CustomerOrder, String> {

    public Set<CustomerOrder> getAll();
}
