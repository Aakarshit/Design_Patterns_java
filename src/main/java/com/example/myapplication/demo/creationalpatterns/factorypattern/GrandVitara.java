package com.example.myapplication.demo.creationalpatterns.factorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GrandVitara implements Car{
    @Override
    public Integer getDoors() {
        return 4;
    }

    @Override
    public String getCarInfo() {
        return "This is grand Vitara Car";
    }
}
