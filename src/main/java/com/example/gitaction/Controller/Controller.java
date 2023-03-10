package com.example.gitaction.Controller;

import com.example.gitaction.Services.ImpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gate1")
public class Controller {

    ImpService impService;
    @Autowired
    public Controller(ImpService impService) {
        this.impService = impService;
    }

    @GetMapping("/greeting")
    public String greeting()
    {
        return "Hello, welcome to my site";
    }

    @GetMapping("/getAll")
    public List<Integer> getAll()
    {
        return impService.getAll();
    }
}
