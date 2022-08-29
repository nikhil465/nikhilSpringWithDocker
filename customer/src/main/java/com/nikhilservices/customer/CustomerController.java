package com.nikhilservices.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {
    CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }

    @GetMapping
    public List<Customer> registerCustomer() {

        return customerService.getAllCustomers();
    }
}