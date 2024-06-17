package com.examenjava.fly.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "flies")
@Entity @Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Fly {
    @Id
    @GeneratedValue
    private Long id;
    private String number;
    private String departureAirport;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime departureTime;
    private String arrivalAirport;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime arrivalTime;
    private String company;
    private double price;
}
