package com.examenjava.fly.repositories;

import com.examenjava.fly.entities.Fly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<Fly, Long> {

}
