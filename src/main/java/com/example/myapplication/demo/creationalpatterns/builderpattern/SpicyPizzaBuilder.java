package com.example.myapplication.demo.creationalpatterns.builderpattern;

public class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public SpicyPizzaBuilder buildDough() {
        pizza.setDough("pan baked");
        return this;
    }

    @Override
    public SpicyPizzaBuilder buildSauce() {
        pizza.setSauce("hot");
        return this;
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni and salami");
    }
}
