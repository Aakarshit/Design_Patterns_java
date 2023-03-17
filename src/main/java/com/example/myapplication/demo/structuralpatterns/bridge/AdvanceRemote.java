package com.example.myapplication.demo.structuralpatterns.bridge;

public class AdvanceRemote<A extends AdvanceDevice> extends BasicRemote {
    A device;
    AdvanceRemote(A device) {
        super(device);
        this.device=device;
    }

    void mute(){
        this.device.setVolume(0);
    }

}
