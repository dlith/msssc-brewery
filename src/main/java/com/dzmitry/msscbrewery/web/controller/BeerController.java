package com.dzmitry.msscbrewery.web.controller;

import com.dzmitry.msscbrewery.web.model.BeerDTO;
import com.dzmitry.msscbrewery.web.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

//@Deprecated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    //POST - create new beer
    @PostMapping
    public ResponseEntity<BeerDTO> handlePost(@Valid @RequestBody BeerDTO beerDTO) {
        BeerDTO savedDto = beerService.saveNewBeer(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + savedDto.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDTO> handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDTO beerDTO) {

        beerService.updateBeer(beerId, beerDTO);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("beerId") UUID beerId) {
        beerService.deleteById(beerId);
    }
}
