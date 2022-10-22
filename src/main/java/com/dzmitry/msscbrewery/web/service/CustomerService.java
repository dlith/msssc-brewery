package com.dzmitry.msscbrewery.web.service;

import com.dzmitry.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID id);
}
