package com.example.myapplication.demo.creationalpatterns.abstractfactory;

import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractFactory<T extends NamedService> {
    private final Map<String, T> map;

    protected AbstractFactory(List<T> list) {
        this.map = list
                .stream()
                .collect(Collectors.toMap(NamedService::name, Function.identity()));
    }

    public T getInstance(@NonNull final String name) {
        T t = map.get(name);
        if (t == null)
            throw new RuntimeException("Unknown service name: " + name);
        return t;
    }
}
