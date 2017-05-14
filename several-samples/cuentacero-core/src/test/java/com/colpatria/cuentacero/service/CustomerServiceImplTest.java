package com.colpatria.cuentacero.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static org.mockito.Mockito.*;

import com.colpatria.cuentacero.data.CustomerRepository;
import com.colpatria.cuentacero.data.model.Customer;
import com.colpatria.cuentacero.services.CustomerServiceImpl;
import com.colpatria.cuentacero.services.dto.CustomerDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerService;

    @Test
    public void shouldReturnSameAmountOfCustomers() {
        List<Customer> dbCustomers = Arrays.asList(
                new Customer(1L, "Michael"),
                new Customer(2L, "Lorena"),
                new Customer(3L, "Her")
        );
        when(customerRepository.findAll()).thenReturn(dbCustomers);

        List<CustomerDTO> customers = customerService.getCustomers();
        assertThat(customers, hasSize(dbCustomers.size()));
    }
}
