package com.example.mastrecalss.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {


    @Value("${app.FakeRepoUse:False}")
    private Boolean FakeRepoUse;




    @Bean
    CommandLineRunner commandLineRunner() {return  args ->

        System.out.println("Command line runner horay ");


    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println(FakeRepoUse);
        return FakeRepoUse ? new CustomerRepository() :new CustomerFakeRepository();
    }
}
