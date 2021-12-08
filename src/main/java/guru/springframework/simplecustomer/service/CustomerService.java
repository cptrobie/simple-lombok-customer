package guru.springframework.simplecustomer.service;

import guru.springframework.simplecustomer.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
