package com.colpatria.cuentacero.services;

import com.colpatria.cuentacero.data.CustomerRepository;
import com.colpatria.cuentacero.data.model.Customer;
import com.colpatria.cuentacero.services.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getCustomers() {
        List<CustomerDTO> customers = new ArrayList<>();
        customerRepository.findAll().forEach(c -> customers.add(new CustomerDTO(c.getId(), c.getName())));
        return customers;
    }

    @Override
    public CustomerDTO getCustomer(Long customerId) {
        Customer customer = this.customerRepository.findOne(customerId);
        if (customer != null) {
            return new CustomerDTO(customer.getId(), customer.getName());
        }
        return null;
    }

}
