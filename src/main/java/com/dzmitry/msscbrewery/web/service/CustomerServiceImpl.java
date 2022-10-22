package com.dzmitry.msscbrewery.web.service;

import com.dzmitry.msscbrewery.web.model.BeerDTO;
import com.dzmitry.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {


    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Oleg")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
        log.debug("Saving a beer...");
        return CustomerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        log.debug("Updating a beer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a beer");
    }
}
