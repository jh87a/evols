package com.examenjava.fly;

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

    // pas nécessaire pour le moment

    @Override
    public Fly getFlyById(Long id) {
        return flyRepository.findById(id).get();
    }

    @Override
    public Fly updateFly(Fly fly) {
        return flyRepository.save(fly);
    }

    @Override
    public void deleteFlyById(Long id) {
        flyRepository.deleteById(id);
    }
}