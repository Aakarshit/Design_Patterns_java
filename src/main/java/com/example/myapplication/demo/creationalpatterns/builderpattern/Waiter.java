package com.example.myapplication.demo.creationalpatterns.builderpattern;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.pizza;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
