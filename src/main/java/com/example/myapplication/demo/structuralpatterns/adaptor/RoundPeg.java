package com.example.myapplication.demo.structuralpatterns.adaptor;

public class RoundPeg {

    Double radius;

    RoundPeg(){
    }

    public RoundPeg(Double radius){
        this.radius=radius;
    }

    public Double getRadius(){
        return this.radius;
    }
}
