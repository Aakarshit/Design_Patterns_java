package com.example.myapplication.demo.creationalpatterns.builderpattern;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BuilderPatternService extends Service {
    @Override
    public void process() {
        Waiter w1=new Waiter();
        Waiter w2=new Waiter();
        w1.setPizzaBuilder(new SpicyPizzaBuilder());
        w1.constructPizza();
        Pizza p1=w1.getPizza();
        w2.setPizzaBuilder(new HawaiianPizzaBuilder());
        w2.constructPizza();
        Pizza p2= w2.getPizza();
        log.info(p1.dough + " " + p1.sauce +" "+p1.topping);
        log.info(p2.dough + " " + p2.sauce +" "+p2.topping);
    }

    @Override
    public int getOrder() {
        return 40;
    }
}
