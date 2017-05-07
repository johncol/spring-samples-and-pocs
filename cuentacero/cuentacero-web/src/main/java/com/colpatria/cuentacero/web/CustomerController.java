package com.colpatria.cuentacero.web;

import com.colpatria.cuentacero.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/")
  public Object getCustomers() {
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


}
