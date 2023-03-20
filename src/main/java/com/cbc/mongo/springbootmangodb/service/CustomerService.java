package com.cbc.mongo.springbootmangodb.service;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.dto.CustomerResponse;
import com.cbc.mongo.springbootmangodb.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<Customer> save(CustomerRequest request);

    ResponseEntity<List<CustomerResponse>>getAll();
}
