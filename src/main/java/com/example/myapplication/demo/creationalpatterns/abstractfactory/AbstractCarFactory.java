package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import java.io.Serializable;

public interface AbstractCarFactory extends NamedService, Serializable {

    Tyre createTyre();

    SideMirror createMirror();
    String name();
}
