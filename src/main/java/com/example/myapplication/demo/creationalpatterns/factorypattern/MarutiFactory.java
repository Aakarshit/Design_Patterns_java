package com.example.myapplication.demo.creationalpatterns.factorypattern;

public class MarutiFactory extends CarFactory{

    @Override
    public Car createCar(int doors) {
        if(doors==2){
            return new Jimny();
        }else if(doors==4){
            return new GrandVitara();
        }
        return null;
    }
}
