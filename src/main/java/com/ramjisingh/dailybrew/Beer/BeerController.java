package com.ramjisingh.dailybrew.Beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/new")
    public void addNewBeer(@RequestBody Beer beer) {
        beerService.addBeer(beer);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all-beer")
    public List<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }
}
