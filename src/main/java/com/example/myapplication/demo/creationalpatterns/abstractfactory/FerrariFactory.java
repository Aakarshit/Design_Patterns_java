package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import org.springframework.stereotype.Component;

@Component
public class FerrariFactory implements AbstractCarFactory {
    @Override
    public Tyre createTyre() {
        return new FerraiTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new FerraiMirror();
    }

    @Override
    public String name() {
        return "FerrariFactory";
    }
}
