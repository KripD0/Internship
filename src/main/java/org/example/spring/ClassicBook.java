package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicBook implements Book {


    @Override
    public void doSomething() {
        System.out.println("This is a Classical Book.");
    }
}
