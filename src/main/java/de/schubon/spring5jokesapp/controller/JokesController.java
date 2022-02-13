package de.schubon.spring5jokesapp.controller;

import de.schubon.spring5jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    @Autowired(required = true)
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping(path = "/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.produceJoke());
        return "index";
    }
}
