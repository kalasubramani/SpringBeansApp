package com.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
  private String name;

  public Parrot()
  {
    System.out.println("Parrot CREATED");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Parrot : " + name;
  }

  // @PostConstruct
  // public void initObjectInAppContext() {
  //   this.name = "   Mimi - the post construct name of the Parrot";
  // }

}
