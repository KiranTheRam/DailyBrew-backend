package com.ramjisingh.dailybrew.Beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    private final BeerRepo beerRepo;

    @Autowired
    public BeerService(BeerRepo beerRepo) {
        this.beerRepo = beerRepo;
    }

    public void addBeer(Beer beer) {
        beerRepo.save(beer);
    }

    public List<Beer> getAllBeers() {
        return beerRepo.findAll();
    }
}
