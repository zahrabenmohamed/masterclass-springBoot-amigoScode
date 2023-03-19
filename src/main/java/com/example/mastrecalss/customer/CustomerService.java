package com.example.mastrecalss.customer;
import com.example.mastrecalss.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private  final CustomerRepo customerRepo;


    public CustomerService( CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    List<Customer> getCustomers(){
        return customerRepo.getCustomers();
    }

    Customer getCustomerById(Long id){
        return getCustomers()
                .stream().
                filter(c->c.getId().equals(id))
                .findFirst()
                .orElseThrow(()->new NotFoundException("customer not found with id " +id));

    }

}
