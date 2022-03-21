package com.gtxc.reactjsspringdatarest;

/*
    Created by gt at 12:44 AM on Tuesday, March 01, 2022.
    Project: spring-data-rest-reactjs, Package: com.gtxc.springdatarestreactjs.
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
