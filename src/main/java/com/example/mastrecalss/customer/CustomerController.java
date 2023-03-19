package com.example.mastrecalss.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomer(){
        return  customerService.getCustomers();

    }

    @GetMapping(path = "{customerId}")
    Customer getCustomerById(@PathVariable("customerId") Long id){
        return customerService.getCustomerById(id);

    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println(customer);
        System.out.println("new post ...");
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId")Long id){
        System.out.println("Delete request a customer by id" + id);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer ){
        System.out.println(" PUT request a customer");
        System.out.println(customer);
    }

}
