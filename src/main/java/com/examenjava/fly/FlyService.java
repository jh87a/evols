package com.examenjava.fly;

import com.examenjava.fly.entities.Fly;

import java.util.List;

public interface FlyService {
    List<Fly> getAllFlies();
    Fly saveFly(Fly fly);

    //pas nécessaire pour le moment
    Fly getFlyById(Long id);
    Fly updateFly(Fly fly);
    void deleteFlyById(Long id);
}
