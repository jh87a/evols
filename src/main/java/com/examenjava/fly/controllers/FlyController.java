package com.examenjava.fly.controllers;

import com.examenjava.fly.repositories.AirportRepository;
import com.examenjava.fly.entities.Fly;
import com.examenjava.fly.FlyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlyController {
    private final FlyService flyService;
    private AirportRepository airportRepository;

    public FlyController(FlyService flyService, AirportRepository airportRepository) {
        super();
        this.flyService = flyService;
        this.airportRepository = airportRepository;
    }

    @GetMapping("/flies")
    public String getFlies(Model model) {
        model.addAttribute("flies", flyService.getAllFlies());
        return "flies";
    }
    @GetMapping("/flies/create")
    public String createFlyForm(Model model) {
        Fly fly = new Fly();
        model.addAttribute("fly", fly);
        model.addAttribute("airports", airportRepository.findAll());
        return "create_fly";
    }
    @PostMapping("/flies/create")
    public String saveFly(@ModelAttribute("fly") Fly fly) {
        flyService.saveFly(fly);
        return "redirect:/flies";
    }
}
