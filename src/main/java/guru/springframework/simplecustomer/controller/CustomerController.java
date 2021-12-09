package guru.springframework.simplecustomer.controller;

import guru.springframework.simplecustomer.model.CustomerDto;
import guru.springframework.simplecustomer.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by michael on 2021-12-08.
 */

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> createCustomer(@RequestBody CustomerDto newCustomer) {
        CustomerDto customer = customerService.saveNewCustomer(newCustomer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/Customer/" + customer.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerToUpdate) {
        customerService.updateCustomer(customerId, customerToUpdate);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId) {
        customerService.deleteCustomerById(customerId);
    }
}
