package com.example.mastrecalss.customer;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Customer {

    private final Long id;
    private final String name;
}
