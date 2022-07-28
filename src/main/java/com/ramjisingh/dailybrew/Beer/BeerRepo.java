package com.ramjisingh.dailybrew.Beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepo extends JpaRepository<Beer, Long> {

}
