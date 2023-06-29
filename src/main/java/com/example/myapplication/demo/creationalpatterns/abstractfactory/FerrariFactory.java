package com.example.myapplication.demo.creationalpatterns.abstractfactory;


public class FerrariFactory implements AbstractCarFactory{
    @Override
    public Tyre createTyre() {
        return new FerraiTyre();
    }

    @Override
    public SideMirror createMirror() {
        return new FerraiMirror();
    }
}
