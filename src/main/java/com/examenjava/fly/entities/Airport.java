package com.examenjava.fly.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity @Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
public class Airport {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
