package com.colpatria.cuentacero.data;

import com.colpatria.cuentacero.data.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

}
