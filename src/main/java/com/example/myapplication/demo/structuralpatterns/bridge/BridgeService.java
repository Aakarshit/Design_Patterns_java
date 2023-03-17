package com.example.myapplication.demo.structuralpatterns.bridge;


import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BridgeService extends Service {
    @Override
    public void process() {
        testDevice(new Tv(),"TV");
        testDevice(new Radio(),"Radio");
    }

    private void testDevice(Device device,String deviceType){
        if(device instanceof  Radio) {
            BasicRemote<Radio> basicRemote = new BasicRemote<>((Radio) device);
            log.info(deviceType + " channel before channel up ---- " + device.getChannel());
            basicRemote.channelUp();
            log.info(deviceType + " channel after channel up ---- " + device.getChannel());
        }else{
            AdvanceRemote<Tv> advanceRemote=new AdvanceRemote<>((Tv)device);
            log.info(deviceType + " Volume before mute --------- "+ device.getVolume());
            advanceRemote.mute();
            log.info(deviceType + " Volume after mute --------- "+ device.getVolume());
            log.info(deviceType + " channel before channel up ---- " + device.getChannel());
            advanceRemote.channelUp();
            log.info(deviceType + " channel after channel up ---- " + device.getChannel());
        }
    }

    @Override
    public int getOrder() {
        return 20;
    }
}
