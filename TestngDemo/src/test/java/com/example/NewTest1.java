package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {

	
		WebDriver wd=null;
		@BeforeTest
		public void intiate() {
			System.out.println("config intiated");
			//register the webdriver =>browser vendor 
					WebDriverManager.chromedriver().setup();
					//creating an object to the object
					 wd=new ChromeDriver();
					//maximize the browser
					wd.manage().window().maximize();
		}
		
		@Test
		public void test1() {
			
			wd.get("https://www.amazon.in/");
		}
		
		@AfterTest
		public void  derefer() {
			System.out.println("wd closed");
			wd.close();
		}


}
