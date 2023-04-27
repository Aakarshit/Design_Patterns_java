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

        AbstractCarFactory buggatiFactory = new BuggatiFactory();
        Tyre buggatiTyre = buggatiFactory.createTyre();
        SideMirror buggatiSideMirror=buggatiFactory.createMirror();
        buggatiTyre.speed();
        buggatiSideMirror.RefractiveIndex();

        AbstractCarFactory ferrariFactory = new FerrariFactory();
        Tyre ferrariTyre = ferrariFactory.createTyre();
        SideMirror ferrariFactoryMirror = ferrariFactory.createMirror();
        ferrariTyre.speed();
        ferrariFactoryMirror.RefractiveIndex();
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
