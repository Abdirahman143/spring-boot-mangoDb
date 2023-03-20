package com.cbc.mongo.springbootmangodb.controller;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.dto.CustomerResponse;
import com.cbc.mongo.springbootmangodb.model.Customer;
import com.cbc.mongo.springbootmangodb.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

           @PostMapping
    public ResponseEntity<Customer>Create(@Valid  @RequestBody CustomerRequest request){
        return customerService.save(request);
    }

    @GetMapping()
    public ResponseEntity<List<CustomerResponse>>getAllCustomer(){
        return customerService.getAll();
    }
}
