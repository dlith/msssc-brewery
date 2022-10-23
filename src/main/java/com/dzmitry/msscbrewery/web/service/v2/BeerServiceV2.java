package com.dzmitry.msscbrewery.web.service.v2;

import com.dzmitry.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDTO);
    void updateBeer(UUID beerId, BeerDtoV2 beerDTO);
    void deleteById(UUID beerId);
}
