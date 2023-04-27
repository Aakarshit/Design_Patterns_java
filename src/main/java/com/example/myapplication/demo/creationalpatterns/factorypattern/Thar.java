package com.example.myapplication.demo.creationalpatterns.factorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Thar implements Car{
    @Override
    public Integer getDoors() {
        return 2;
    }

    @Override
    public String getCarInfo() {
        return "This is Thar Car";
    }
}
