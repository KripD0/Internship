package org.example.spring;

public class RealisticBook implements Book{

    @Override
    public void doSomething() {
        System.out.println("This is a Realistic Book.");
    }
}
