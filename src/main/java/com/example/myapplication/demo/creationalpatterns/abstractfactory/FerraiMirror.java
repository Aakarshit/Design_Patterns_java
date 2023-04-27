package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class FerraiMirror implements SideMirror{
    @Override
    public void RefractiveIndex() {
        System.out.println("Ferrai RI is 3.57");
    }
}