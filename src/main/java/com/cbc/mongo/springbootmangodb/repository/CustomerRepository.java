package com.cbc.mongo.springbootmangodb.repository;

import com.cbc.mongo.springbootmangodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
