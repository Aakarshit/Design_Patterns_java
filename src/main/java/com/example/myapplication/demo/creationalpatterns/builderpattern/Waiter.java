package com.example.myapplication.demo.creationalpatterns.builderpattern;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza().buildDough().buildSauce().buildTopping();
    }
}
