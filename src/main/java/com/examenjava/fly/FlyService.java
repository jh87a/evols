package com.examenjava.fly;

import org.springframework.stereotype.Service;

import java.util.List;

public interface FlyService {
    List<Fly> getAllFlies();
    Fly saveFly(Fly fly);

    //pas nécessaire pour le moment
    Fly getFlyById(Long id);
    Fly updateFly(Fly fly);
    void deleteFlyById(Long id);
}
