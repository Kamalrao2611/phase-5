package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependencyTesting {
	
	String bookId = null;
	
  @Test(priority= 1)
  public void booking() {
	  System.out.println("Booking started");
	  int a = 50/0;
	  bookId = "xyz";
	  
  }
  
  @Test(priority=2, dependsOnMethods= {"booking"})
  public void tracking() {
	  
	  if(bookId != null) {
		  System.out.println("Order can be tracked");
	  }
	  else
	  {
		  System.out.println("Booking failed cannot be tracked");
	  }
  }
  

  @Test(priority=2, dependsOnMethods= {"booking"})
  public void cancel() {
	  
	  if(bookId != null) {
		  System.out.println("Order can be cancelled");
	  }
	  else
	  {
		  System.out.println("Booking failed cannot be cancelled");
	  }
  }
}
