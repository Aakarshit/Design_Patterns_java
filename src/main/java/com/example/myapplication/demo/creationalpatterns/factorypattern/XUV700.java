package com.example.myapplication.demo.creationalpatterns.factorypattern;



public class XUV700 implements Car{
    @Override
    public Integer getDoors() {
        return 4;
    }

    @Override
    public String getCarInfo() {
        return "This is XUV700";
    }
}
