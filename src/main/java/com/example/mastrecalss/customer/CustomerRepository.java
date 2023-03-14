package com.example.mastrecalss.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo{
    @Override
    //TODO connect to real db
    public List<Customer> getCustomers() {
        return Collections.EMPTY_LIST;
    }



}
