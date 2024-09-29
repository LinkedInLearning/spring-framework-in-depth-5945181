package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

  @Value("Hello")
  private String greeting;

  @Bean
  public TimeService timeService(){
    return new TimeService(true);
  }

  @Bean
  public OutputService outputService(GreetingService greetingService, TimeService timeService){
    return new OutputService(greetingService, timeService);
  }

  @Bean
  public GreetingService greetingService(){
    return new GreetingService(greeting);
  }

}
