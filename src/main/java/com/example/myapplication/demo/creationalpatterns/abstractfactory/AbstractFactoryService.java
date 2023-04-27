package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AbstractFactoryService extends Service {

    public AbstractFactoryService(){
        log.info("Entered Abstract factory service");
    }
    @Override
    public void process() {
        CarFactory carFactory;
        carFactory = getFactory("Buggati");
        Tyre t=carFactory.createTyre();
        SideMirror sm=carFactory.createMirror();
        t.speed();
        sm.RefractiveIndex();
    }
    CarFactory getFactory(String str){
        return str.equalsIgnoreCase("Ferrari") ? new FerrariFactory() : new BuggatiFactory();
    }


    @Override
    public int getOrder() {
        return 10;
    }
}
