package com.example.myapplication.demo.structuralpatterns.bridge;

import org.springframework.stereotype.Component;

@Component
public class Tv implements AdvanceDevice{
    private int volume=10;
    private int channel=1;
    private boolean enabled=true;


    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled=true;
    }

    @Override
    public void disable() {
        this.enabled=false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume=percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public void printStatus() {
        System.out.println("This is Tv Object");
    }
}
