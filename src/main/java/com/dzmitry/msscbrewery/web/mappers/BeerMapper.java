package com.dzmitry.msscbrewery.web.mappers;

import com.dzmitry.msscbrewery.web.domain.Beer;
import com.dzmitry.msscbrewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO dto);
}
