package com.example.myapplication.demo.structuralpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class FerraiTyre implements Tyre{

    @Override
    public void speed() {
        System.out.println("Ferrai's top speed is 400km/ph");
    }
}
