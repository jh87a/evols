package com.examenjava.fly;

import com.examenjava.fly.entities.Fly;

import java.util.List;

public interface FlyService {
    List<Fly> getAllFlies();
    Fly saveFly(Fly fly);

}
