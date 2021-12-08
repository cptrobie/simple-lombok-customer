package guru.springframework.simplecustomer.service;

import guru.springframework.simplecustomer.model.CustomerDto;

import java.util.UUID;

/**
 * @Author: michael
 * @CreateDate: 12/8/21
 */

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
