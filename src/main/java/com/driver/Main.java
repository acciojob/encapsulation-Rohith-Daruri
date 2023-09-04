package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly r = new RWOnly();

//      'name' has private access in 'com.driver.RWOnly'
      r.setName("Rohith");
      System.out.println(r.getName());
  }
}