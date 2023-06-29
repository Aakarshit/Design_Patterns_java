package com.example.myapplication.demo.creationalpatterns.abstractfactory;



public class BuggatiFactory implements AbstractCarFactory{
    @Override
    public Tyre createTyre() {
        return new BuggatiTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new BuggatiMirror();
    }
}
