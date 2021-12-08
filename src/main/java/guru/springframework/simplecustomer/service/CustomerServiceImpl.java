package guru.springframework.simplecustomer.service;

import guru.springframework.simplecustomer.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by michael on 2021-12-08.
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Joe Black")
                .build();
    }
}
