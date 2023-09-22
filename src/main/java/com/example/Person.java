package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private Parrot parrot;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Parrot getParrot() {
    return parrot;
  }
  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }
  

  @Autowired
  private Myna thePersonsMyna;

 public Myna getMyna()
 {
  return thePersonsMyna;
 }
public void setMyna(Myna newMyna)
{
  this.thePersonsMyna=newMyna;
}
}
