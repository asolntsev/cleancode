package io.asolntsev.hello;

import java.time.LocalDate;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.printf("Today is %s%n", LocalDate.now());
  }
}