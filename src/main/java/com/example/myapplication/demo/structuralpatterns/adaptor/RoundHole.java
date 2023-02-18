package com.example.myapplication.demo.structuralpatterns.adaptor;

public class RoundHole {
    Integer radius;
    public RoundHole(Integer radius){
        this.radius=radius;
    }
    Integer getRadius(){
        return this.radius;
    }
    public Boolean itFits(RoundPeg r){
        return this.getRadius() >= r.getRadius();
    }
}
