package com.colpatria.cuentacero.web;

import com.colpatria.cuentacero.services.CustomerService;
import com.colpatria.cuentacero.services.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/")
  public List<CustomerDTO> getCustomers() {
    return this.customerService.getCustomers();
  }

  @GetMapping("/as-string")
  public String getCustomersAsString() {
    return this.customerService
        .getCustomers()
        .stream()
        .reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append)
        .toString();
  }

  @GetMapping("/{customer}")
  public CustomerDTO getCustomer(@PathVariable("customer") Long customer) {
    return this.customerService.getCustomer(customer);
  }

}
