package com.example.myapplication.demo.structuralpatterns.bridge;



public class BasicRemote<B extends Device> implements Remote{

    B device;


    BasicRemote(B device){
        this.device= device;
    }
    BasicRemote(){

    }


    @Override
    public void power() {
        if(device.isEnabled()){
            device.disable();
        }else{
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume()-10);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume()+10);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel()+1);
    }
}
