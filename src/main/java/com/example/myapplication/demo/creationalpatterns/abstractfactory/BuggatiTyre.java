package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class BuggatiTyre implements Tyre{
    @Override
    public void speed() {
        System.out.println("Buggati top speed is 450kmph");
    }
}
