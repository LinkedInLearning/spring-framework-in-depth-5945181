package com.frankmoley.lil.fid;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.frankmoley.lil.fid")
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class ApplicationConfig {


}
