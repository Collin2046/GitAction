package com.example.gitaction;

import com.example.gitaction.Controller.Controller;
import com.example.gitaction.Services.ImpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GitActionApplicationTests {
    @Autowired
    ImpService service;
    @Autowired
    Controller controller;

    @Test
    void contextLoads() {
        assertEquals(Arrays.asList(1,2,3),service.getAll());

    }

    @Test
    void GreetingTest()
    {
        assertEquals("Hello, welcome to my site", controller.greeting());
    }

}
