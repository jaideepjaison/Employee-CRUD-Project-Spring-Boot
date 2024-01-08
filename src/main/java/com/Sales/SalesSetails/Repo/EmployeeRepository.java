package com.Sales.SalesSetails.Repo;

import com.Sales.SalesSetails.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    // Additional custom queries can be added here if needed
}
