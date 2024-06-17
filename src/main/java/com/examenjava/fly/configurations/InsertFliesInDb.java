package com.examenjava.fly.configurations;

import com.examenjava.fly.entities.Airport;
import com.examenjava.fly.repositories.AirportRepository;
import com.examenjava.fly.entities.Fly;
import com.examenjava.fly.repositories.FlyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class InsertFliesInDb {
    Logger logger = LoggerFactory.getLogger(InsertFliesInDb.class);

    @Bean
    CommandLineRunner insertFlies(FlyRepository flyRepository) {
        return args -> {
            insertFlies(flyRepository, "A1",
                    "Burssels",
                    LocalDateTime.of(2024, 7, 1, 10, 32),
                    "London",
                    LocalDateTime.of(2024, 7, 1, 10, 39),
                    "Top airlines",
                    421.23);
            insertFlies(flyRepository,
                    "B021",
                    "Amsterdam",
                    LocalDateTime.of(2024, 7, 1, 12, 20),
                    "Brussels",
                    LocalDateTime.of(2024, 7, 1, 11, 42),
                    "Top airlines",
                    214.83);
        };
    }

    @Bean
    CommandLineRunner insertAirports(AirportRepository airportRepository) {
        return args -> {
            Airport[] airports = {
                    new Airport(null, "Brussels"),
                    new Airport(null, "London"),
                    new Airport(null, "Amsterdam"),
                    new Airport(null, "Berlin"),
                    new Airport(null, "Paris"),
                    new Airport(null, "Roma"),
                    new Airport(null, "Zurich")};
            for (Airport airport : airports) {
                insertAirports(airportRepository, airport.getName());
            }
        };
    }

    public void insertAirports(AirportRepository airportRepository, String name) {
        Airport airport = new Airport(null, name);
        airportRepository.save(airport);
        logger.info("Airport " + airport + " added.");
    }

    public void insertFlies(FlyRepository flyRepository, String number, String departureAirport, LocalDateTime departureTime, String arrivalAirport, LocalDateTime arrivalTime, String company, double price) {
        Fly fly = new Fly(null, number, departureAirport, departureTime, arrivalAirport, arrivalTime, company, price);
        flyRepository.save(fly);
        logger.info("Fly " + fly + " inserted.");
    }

}
