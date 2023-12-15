package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarFactory extends AbstractFactory<AbstractCarFactory>{
    @Autowired
    protected CarFactory(List<AbstractCarFactory> list) {
        super(list);
    }

}
