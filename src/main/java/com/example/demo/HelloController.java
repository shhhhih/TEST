package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Alice");
        return "hello";
    }
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("names", java.util.List.of("Alice", "Bob", "Carol"));
        return "list";
    }
}