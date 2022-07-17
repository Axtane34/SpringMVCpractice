package ru.axtane.springMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.axtane.springMVC.dao.ComposerDAO;
import ru.axtane.springMVC.models.Composer;
import ru.axtane.springMVC.util.ComposerValidator;

@Controller
@RequestMapping("/composer")
public class ComposerController {
    private final ComposerDAO composerDAO;
    private final ComposerValidator composerValidator;

    @Autowired
    public ComposerController(ComposerDAO composerDAO, ComposerValidator composerValidator) {
        this.composerDAO = composerDAO;
        this.composerValidator = composerValidator;
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
        return "composer/newComposer";
    }
}
