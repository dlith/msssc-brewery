package com.dzmitry.msscbrewery.web.service;

import com.dzmitry.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Oleg")
                .build();
    }
}
