package com.example.myapplication.demo.creationalpatterns.builderpattern;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BuilderPatternService extends Service {
    @Override
    public void process() {
        Chef c1=new Chef();
        Chef c2=new Chef();
        c1.setPizzaBuilder(new SpicyPizzaBuilder());
        c1.constructPizza();
        Pizza p1=c1.getPizza();
        c2.setPizzaBuilder(new HawaiianPizzaBuilder());
        c2.constructPizza();
        Pizza p2= c2.getPizza();
        log.info(p1.dough + " " + p1.sauce +" "+p1.topping);
        log.info(p2.dough + " " + p2.sauce +" "+p2.topping);
    }

    @Override
    public int getOrder() {
        return 40;
    }
}
