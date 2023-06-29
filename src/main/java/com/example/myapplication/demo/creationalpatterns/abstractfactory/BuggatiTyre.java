package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuggatiTyre implements Tyre{
    @Override
    public void speed() {
        log.info("Buggati top speed is 450kmph");
    }
}
