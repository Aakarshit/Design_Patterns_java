package com.example.myapplication.demo.creationalpatterns.builderpattern;

public abstract class PizzaBuilder {

    Pizza pizza;
    public Pizza getPizza(){
        return this.pizza;
    }

    public PizzaBuilder createNewPizza() {
        this.pizza = new Pizza();
        return this;
    }

    public abstract PizzaBuilder buildDough();
    public abstract PizzaBuilder buildSauce();
    public abstract PizzaBuilder buildTopping();
}
