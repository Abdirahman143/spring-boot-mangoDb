package com.cbc.mongo.springbootmangodb.service;

import com.cbc.mongo.springbootmangodb.dto.CustomerRequest;
import com.cbc.mongo.springbootmangodb.dto.CustomerResponse;
import com.cbc.mongo.springbootmangodb.model.Customer;
import com.cbc.mongo.springbootmangodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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


   @Override
    public ResponseEntity<List<CustomerResponse>>getAll(){
        List<Customer>customers = customerRepository.findAll();
        List<CustomerResponse> responseList= customers.stream().
                map(this::MapToCustomerResponse).toList();
       return new ResponseEntity<>(responseList, HttpStatus.FOUND);
    }

    private CustomerResponse MapToCustomerResponse(Customer customer) {
         return CustomerResponse.
                 builder().
                 id(customer.getId()). 
                 customerId(customer.getCustomerId()).
                 Name(customer.getName()).
                 email(customer.getEmail()).
                 build();
    }
}
