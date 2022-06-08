package ru.axtane.springMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calcPage(@RequestParam(value = "a", required = false) Double a,
                            @RequestParam(value = "b", required = false) Double b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model) {
        Object result;
        double switchCase = switch (action) {
            case "multiplication" -> a*b;
            case "division" -> a/b;
            case "addition" -> a+b;
            case "subtraction" -> a-b;
            default -> 0.0;
        };
        if (!action.equals("division")){
            result = (int)switchCase;
        }else {
            result = switchCase;
        }

        model.addAttribute("result", "Hello, your digit is: " + result);

        return "first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}

/*@GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }*/