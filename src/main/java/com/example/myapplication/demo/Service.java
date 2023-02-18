package com.example.myapplication.demo;

import org.springframework.core.Ordered;

public abstract class Service implements Ordered {
    public abstract void process();

}
