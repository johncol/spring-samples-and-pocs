package com.colpatria.cuentacero.services;

import com.colpatria.cuentacero.services.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getCustomers();

}
