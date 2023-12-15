package com.example.myapplication.demo.creationalpatterns.abstractfactory;


import org.springframework.stereotype.Component;

@Component
public class FerrariFactory implements AbstractCarFactory {
    @Override
    public Tyre createTyre() {
        return new FerrariTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new FerrariMirror();
    }

    @Override
    public String name() {
        return "FerrariFactory";
    }
}
