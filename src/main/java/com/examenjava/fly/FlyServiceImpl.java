package com.examenjava.fly;

import com.examenjava.fly.entities.Fly;
import com.examenjava.fly.repositories.FlyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlyServiceImpl implements FlyService {

    private final FlyRepository flyRepository;

    public FlyServiceImpl(FlyRepository flyRepository) {
        super();
        this.flyRepository = flyRepository;
    }


    @Override
    public List<Fly> getAllFlies() {
        return flyRepository.findAll();
    }

    @Override
    public Fly saveFly(Fly fly) {
        return flyRepository.save(fly);
    }

}
