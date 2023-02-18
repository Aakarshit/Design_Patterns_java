package com.example.myapplication.demo;

import com.example.myapplication.demo.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Execution {

    private final List<Service> serviceList;

    Execution(List<Service> serviceList){
        this.serviceList=serviceList;
    }

    public void start(){
        this.serviceList.forEach(i -> {
             i.process();
        });
    }

}
