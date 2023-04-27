package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class FerrariFactory implements CarFactory{
    @Override
    public Tyre createTyre() {
        return new FerraiTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new FerraiMirror();
    }
}
