package com.Sales.SalesSetails.Repo;

import com.Sales.SalesSetails.Model.Client;
import com.Sales.SalesSetails.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
