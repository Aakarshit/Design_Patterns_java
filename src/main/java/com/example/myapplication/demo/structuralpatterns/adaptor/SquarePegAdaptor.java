package com.example.myapplication.demo.structuralpatterns.adaptor;

public class SquarePegAdaptor extends RoundPeg {

    SquarePeg squarePeg;
    public SquarePegAdaptor(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }


    @Override
    public Double getRadius() {
        Double result = Math.sqrt(Math.pow((this.squarePeg.getSide() / 2), 2) * 2);
        return result;
    }
}
