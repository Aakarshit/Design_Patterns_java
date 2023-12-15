package com.example.myapplication.demo.creationalpatterns.builderpattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PizzaBuilder {

    Pizza pizza;
    public PizzaBuilder createNewPizza() {
        this.pizza = new Pizza();
        return this;
    }

    public abstract PizzaBuilder buildDough();
    public abstract PizzaBuilder buildSauce();
    public abstract void buildTopping();
}
