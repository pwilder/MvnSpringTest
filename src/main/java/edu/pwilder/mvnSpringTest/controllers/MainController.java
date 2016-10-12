package edu.pwilder.mvnSpringTest.controllers;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pwilder.mvnSpringTest.model.Greeting;

@RestController
public class MainController {
    
    private AtomicInteger atomicInt = new AtomicInteger(0);
    
    @RequestMapping("/greeting")
    public Greeting doGreeting() {
        return new Greeting(atomicInt.getAndIncrement(), "Hello World!");
    }
}
