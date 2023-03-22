package com.hope.sps;

import com.hope.sps.customer.CustomerRepository;
import com.hope.sps.officer.OfficerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.DayOfWeek;
import java.util.Set;

@SpringBootApplication
public class SpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpsApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(OfficerRepository customerRepository) {
        return args -> {
            customerRepository.findAll().forEach(System.out::println);
        };
    }

}
