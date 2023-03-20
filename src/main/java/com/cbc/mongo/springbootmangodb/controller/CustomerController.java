package com.cbc.mongo.springbootmangodb.controller;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.model.Customer;
import com.cbc.mongo.springbootmangodb.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    public ResponseEntity<Customer>Create(@Valid  @RequestBody CustomerRequest request){
        return customerService.save(request);
    }
}
