package com.example.mastrecalss.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepo {

    public  List<Customer> getCustomers();
}
