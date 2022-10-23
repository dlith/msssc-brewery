package com.dzmitry.msscbrewery.web.service.v2;


import com.dzmitry.msscbrewery.web.model.BeerDTO;
import com.dzmitry.msscbrewery.web.model.v2.BeerDtoV2;
import com.dzmitry.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDTO) {
        log.debug("Saving a beer...");
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDTO) {
        //to do impl - would add a real impl to update beer
        log.debug("Updating a beer...");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
