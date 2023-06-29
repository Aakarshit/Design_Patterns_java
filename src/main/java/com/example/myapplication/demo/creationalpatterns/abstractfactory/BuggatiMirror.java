package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuggatiMirror implements SideMirror{
    @Override
    public void RefractiveIndex() {
        log.info("Buggati refractive index is 6.58");
    }
}
