package com.examenjava.fly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlyController {
    private final FlyService flyService;

    public FlyController(FlyService flyService) {
        super();
        this.flyService = flyService;
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
        return "flies-create";
    }
    @PostMapping("/flies")
    public String saveFly(@ModelAttribute("fly") Fly fly) {
        flyService.saveFly(fly);
        return "redirect:/flies";
    }
}
