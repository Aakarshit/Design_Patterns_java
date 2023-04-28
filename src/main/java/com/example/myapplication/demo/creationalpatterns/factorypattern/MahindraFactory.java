package com.example.myapplication.demo.creationalpatterns.factorypattern;

public class MahindraFactory implements CarFactory{
    @Override
    public Car createCar(int doors) {
        if(doors==3){
            return new Thar();
        }else if(doors==4){
            return new XUV700();
        }
        return null;
    }
}
