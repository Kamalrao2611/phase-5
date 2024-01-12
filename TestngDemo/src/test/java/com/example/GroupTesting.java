package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupTesting {
	WebDriver wd = null;
	
	
	public void initiate() {
		System.out.println("config intiated");
		//register the webdriver =>browser vendor 
				WebDriverManager.chromedriver().setup();
				//creating an object to the object
				 wd=new ChromeDriver();
				//maximize the browser
				wd.manage().window().maximize();

	}
	
	@Test(groups= {"ecommerce", "education"})
	public void amazon() {
		initiate();
		wd.get("https://www.amazon.in/");
		System.out.println("Amazon opened");
	}
	
	@Test(groups= {"education"})
	public void simplilearn() {
		initiate();
		wd.get("https://www.simplilearn.com/");
		System.out.println("Simplilearn opened");
	}
	
	@Test(groups= {"ecommerce"})
	public void flipkart() {
		initiate();
		wd.get("https://www.flipkart.com/");
		System.out.println("flipkart opened");
	}
	
	@Test(groups= {"education"})
	public void interviewbit() {
		initiate();
		wd.get("https://www.interviewbit.com/");
		System.out.println("Interview opened");
	}
	
	@Test(groups= {"ecommerce"})
	public void myntra() {
		initiate();
		wd.get("https://www.myntra.com/");
		System.out.println("myntra opened");
	}
	
	@AfterTest
	public void derefer() {
		wd.close();
	}

}
