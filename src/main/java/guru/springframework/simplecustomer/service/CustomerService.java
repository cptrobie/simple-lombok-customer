package guru.springframework.simplecustomer.service;

import guru.springframework.simplecustomer.model.CustomerDto;

import java.util.UUID;

/**
 * Created by michael on 2021-12-08.
 */

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto newCustomer);

    void updateCustomer(UUID customerId, CustomerDto customerToUpdate);

    void deleteCustomerById(UUID customerId);
}
