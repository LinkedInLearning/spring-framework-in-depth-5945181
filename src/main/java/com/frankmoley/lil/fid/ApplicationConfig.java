package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class ApplicationConfig {

  @Value("${app.greeting}")
  private String greeting;

  @Value("${app.name}")
  private String name;

  @Bean
  @Profile("!dev")
  public TimeService timeService(){
    return new TimeService(true);
  }

  @Bean
  @Profile("dev")
  public TimeService timeService12(){
    return new TimeService(false);
  }

  @Bean
  public OutputService outputService(GreetingService greetingService, TimeService timeService){
    return new OutputService(greetingService, timeService, name);
  }

  @Bean
  public GreetingService greetingService(){
    return new GreetingService(greeting);
  }

}
