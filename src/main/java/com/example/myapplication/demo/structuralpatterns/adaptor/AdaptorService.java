package com.example.myapplication.demo.structuralpatterns.adaptor;

import com.example.myapplication.demo.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AdaptorService extends Service {

    AdaptorService(){
        log.info("entered Adaptor Service");
    }

    @Override
    public void process() {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(6.0);

        SquarePeg squarePeg1 = new SquarePeg(2.0);
        SquarePeg squarePeg2 = new SquarePeg(20.0);

        SquarePegAdaptor squarePegAdaptor1 = new SquarePegAdaptor(squarePeg1);
        SquarePegAdaptor squarePegAdaptor2 = new SquarePegAdaptor(squarePeg2);

        log.info(roundHole.itFits(squarePegAdaptor1).toString());
        log.info(roundHole.itFits(squarePegAdaptor2).toString());
        log.info(roundHole.itFits(roundPeg).toString());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
