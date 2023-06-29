package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FerraiTyre implements Tyre{

    @Override
    public void speed() {
        log.info("Ferrari's top speed is 400km/ph");
    }
}
