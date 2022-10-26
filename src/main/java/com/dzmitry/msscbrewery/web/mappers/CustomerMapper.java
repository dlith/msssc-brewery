package com.dzmitry.msscbrewery.web.mappers;

import com.dzmitry.msscbrewery.web.domain.Customer;
import com.dzmitry.msscbrewery.web.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
