package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PriorityTesting {
	
  @Test(priority = 1)
  public void signup() {
	  System.out.println("Test Sign up ");
  }
  
  @Test(priority = 2)
  public void signin() {
	  System.out.println("Test Sign in");
  }
  
  @Test(priority = 3)
  public void search() {
	  System.out.println("Test Search");
  }
  
  @Test(priority = 4)
  public void book() {
	  System.out.println("Test booking ");
  }
  
  @Test(priority = 5)
  public void pay() {
	  System.out.println("test pay");
  }
  
  @Test(priority = 6)
  public void logoff() {
	  System.out.println("test logoff");
  }
  
}
