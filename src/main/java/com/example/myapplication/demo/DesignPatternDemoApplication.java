package com.example.myapplication.demo;

import com.example.myapplication.demo.structuralpatterns.adaptor.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;


@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DesignPatternDemoApplication {


    @Autowired
    Execution execution;

    @PostConstruct
    public void start(){
        execution.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternDemoApplication.class, args);
    }

}
