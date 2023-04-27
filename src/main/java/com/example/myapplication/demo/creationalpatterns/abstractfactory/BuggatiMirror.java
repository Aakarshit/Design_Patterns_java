package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class BuggatiMirror implements SideMirror{
    @Override
    public void RefractiveIndex() {
        System.out.println("Buggati refractive index is 6.58");
    }
}
