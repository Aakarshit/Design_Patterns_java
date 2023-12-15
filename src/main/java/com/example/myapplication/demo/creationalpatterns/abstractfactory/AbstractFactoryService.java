package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import com.example.myapplication.demo.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AbstractFactoryService extends Service {


    private final CarFactory carFactory;

    @Override
    public void process() {
        FerrariFactory ferrariFactory = (FerrariFactory) carFactory.getInstance("FerrariFactory");
        SideMirror ferrariMirror = ferrariFactory.createMirror();
        ferrariMirror.RefractiveIndex();
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
