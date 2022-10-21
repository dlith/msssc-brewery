package com.dzmitry.msscbrewery.web.service;

import com.dzmitry.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
}
