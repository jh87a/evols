package com.examenjava.fly;

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

    public void insertFlies(FlyRepository flyRepository,
                            String number,
                            String departureAirport,
                            LocalDateTime departureTime,
                            String arrivalAirport,
                            LocalDateTime arrivalTime,
                            String company,
                            double price) {
        Fly fly = new Fly(null, number, departureAirport, departureTime, arrivalAirport, arrivalTime, company, price);
        flyRepository.save(fly);
        logger.info("Fly " + fly + " inserted.");
    }

}
