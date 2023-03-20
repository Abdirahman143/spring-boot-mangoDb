package com.cbc.mongo.springbootmangodb.service;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.model.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<Customer> save(CustomerRequest request);
}
