package com.example.myapplication.demo.creationalpatterns.factorypattern;


public class Thar implements Car{
    @Override
    public Integer getDoors() {
        return 3;
    }

    @Override
    public String getCarInfo() {
        return "This is Thar Car";
    }
}
