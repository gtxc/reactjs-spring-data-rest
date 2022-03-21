package com.gtxc.reactjsspringdatarest;

/*
    Created by gt at 12:35 AM on Tuesday, March 01, 2022.
    Project: spring-data-rest-reactjs, Package: com.gtxc.springdatarestreactjs.
*/

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
