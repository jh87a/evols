package com.examenjava.fly.repositories;

import com.examenjava.fly.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {

}
