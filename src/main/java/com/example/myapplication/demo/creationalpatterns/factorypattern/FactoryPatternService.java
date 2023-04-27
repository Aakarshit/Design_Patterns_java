package com.example.myapplication.demo.creationalpatterns.factorypattern;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FactoryPatternService extends Service {
    @Override
    public void process() {
        MahindraFactory mahindraFactory=new MahindraFactory();
        Car car=mahindraFactory.createCar(4);
        log.info("Car details : "+ car.getCarInfo());
        log.info("Car doors : "+ car.getDoors().toString());

        MarutiFactory marutiFactory=new MarutiFactory();

        Car car1=marutiFactory.createCar(2);
        log.info("Car details : "+ car1.getCarInfo());
        log.info("Car doors : "+ car1.getDoors().toString());
    }

    @Override
    public int getOrder() {
        return 30;
    }
}
