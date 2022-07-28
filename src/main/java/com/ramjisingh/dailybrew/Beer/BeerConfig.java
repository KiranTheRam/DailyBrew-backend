package com.ramjisingh.dailybrew.Beer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeerConfig {

    @Bean
    CommandLineRunner commandLineRunner(BeerRepo beerRepo) {
        return args -> {
            Beer corona = new Beer(1L, "Corona", "Coahuila, Mexico", "https://image.cnbcfm.com/api/v1/image/103525542-GettyImages-170138993.jpg?v=1638907990", "A Taste of Mexico");
            Beer modelo = new Beer(2L, "Modelo", "Coahuila, Mexico", "https://cdn.shopify.com/s/files/1/0605/9520/8383/files/Especial-02_0_1024x1024.jpg?v=1639998653", "A Better Taste of Mexico");
            beerRepo.saveAll(List.of(corona, modelo));
        };
    }
}
