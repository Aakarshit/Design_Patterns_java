package com.example.myapplication.demo.creationalpatterns.builderpattern;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BuilderPatternService extends Service {
    @Override
    public void process() {
        Waiter w=new Waiter();
        SpicyPizzaBuilder spicyPizzaBuilder=new SpicyPizzaBuilder();
        w.setPizzaBuilder(spicyPizzaBuilder);
        w.constructPizza();
        Pizza pi=w.getPizza();
        log.info(pi.dough + " " + pi.sauce +" "+pi.topping);
    }

    @Override
    public int getOrder() {
        return 40;
    }
}
