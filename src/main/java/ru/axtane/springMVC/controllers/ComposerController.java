package ru.axtane.springMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.axtane.springMVC.dao.ComposerDAO;
import ru.axtane.springMVC.models.Composer;


@Controller
@RequestMapping("/composer")
public class ComposerController {
    private final ComposerDAO composerDAO;


    @Autowired
    public ComposerController(ComposerDAO composerDAO) {
        this.composerDAO = composerDAO;
    }

    @GetMapping("/{name}")
    public String show(@PathVariable("name") String name, Model model) {
        model.addAttribute("composer", composerDAO.show(name));
        return "composer/aboutComposer";
    }

    @GetMapping("/newComposer")
    public String newComposer(@ModelAttribute("composer") Composer composer){
        return "composer/newComposer";
    }

    @PostMapping()
    public String create(@ModelAttribute("composer") Composer composer){
        composerDAO.save(composer);
        return "composer/aboutComposer";
    }
}
