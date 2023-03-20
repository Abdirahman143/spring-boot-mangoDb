package com.cbc.mongo.springbootmangodb.service;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.model.Customer;
import com.cbc.mongo.springbootmangodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

     @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public ResponseEntity<Customer>save(CustomerRequest request){
         Customer customer = Customer.
                 builder().
                 customerId(request.getCustomerId()).
                 Name(request.getName()).
                 email(request.getEmail()).
                 build();
         return new ResponseEntity<>(customerRepository.save(customer), HttpStatus.CREATED);
    }


}
