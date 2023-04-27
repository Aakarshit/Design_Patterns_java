package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class BuggatiFactory implements CarFactory{
    @Override
    public Tyre createTyre() {
        return new BuggatiTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new BuggatiMirror();
    }
}
