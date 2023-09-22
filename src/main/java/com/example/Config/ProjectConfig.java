package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.Parrot;
import com.example.Person;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ProjectConfig {

  @Bean
  Parrot parrot3() {
    var p = new Parrot();
    p.setName("koko");
    return p;
  }

  @Bean
  public Parrot parrot() {
    var p = new Parrot();
    p.setName("kiki");
    return p;
  }

 // @Primary
  @Bean(name = "parrot2")
  Parrot parrot2() {
    var p = new Parrot();
    p.setName("miki");
    return p;
  }

  @Bean(value = "appName")
  String newNAME() {
    return "My Spring App - understanding IoC";
  }

  @Bean
  Integer appCode() {
    return 10011;
  }

  @Bean(name = "appCode")
  String appCodeString() {
    return "10011";
  }

  @Bean
  public Person person()
  {
    Person p = new Person();
    p.setName("Karadi");
    p.setParrot(parrot());
    return p;
  }

}
