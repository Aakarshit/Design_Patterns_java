package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FerrariMirror implements SideMirror{
    @Override
    public void RefractiveIndex() {
        log.info("Ferrai RI is 3.57");
    }
}
