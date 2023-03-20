package com.cbc.mongo.springbootmangodb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {
    private String id;
    private String customerId;
    private String Name;
    private String email;
}
