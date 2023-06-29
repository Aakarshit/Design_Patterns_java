package com.example.myapplication.demo.creationalpatterns.builderpattern;

public class HawaiianPizzaBuilder extends PizzaBuilder{

    @Override
    public HawaiianPizzaBuilder buildDough() {
        pizza.setDough("cross");
        return this;
    }

    @Override
    public HawaiianPizzaBuilder buildSauce() {
        pizza.setSauce("mild");
        return this;
    }

    @Override
    public HawaiianPizzaBuilder buildTopping() {
        pizza.setTopping("ham and pineapple");
        return this;
    }
}
