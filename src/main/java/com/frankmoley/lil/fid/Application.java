package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;

public class Application {

    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingService("Hello");
        TimeService timeService = new TimeService(true);
        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Frank");
            Thread.sleep(5000);
        }
    }
}