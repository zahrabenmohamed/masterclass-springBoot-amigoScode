package com.example.mastrecalss.customer;

import java.util.ArrayList;
import java.util.List;
public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1L,"zahra benmohamed","12345","benmedzahra20@gmail.com"));
        return customers;
    }
}
