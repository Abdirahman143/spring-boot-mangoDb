package com.cbc.mongo.springbootmangodb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "customer_cl"
)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false,unique = true)
    private String customerId;
    @NotNull
    private String Name;
    @NotNull
    @Email
    private String email;
}
