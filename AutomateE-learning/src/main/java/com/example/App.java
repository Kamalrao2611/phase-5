package com.example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        
        wd.manage().window().maximize();
        
        wd.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        
        wd.get("https://www.flipkart.com/");
        
        takeScreenShot(wd, "abc");
        
        wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("iphone 13");
        wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/button/svg/path[1]")).click();
        
       
		JavascriptExecutor js=(JavascriptExecutor) wd;
		
//		no of pixels move down
//		js.executeScript("window.scrollBy(0,1000)");
		
//		till we get the element 
//		WebElement we=wd.findElement(By.linkText("Help"));
//		js.executeScript("arguments[0].scrollIntoView();",we);
//		we.click();
		
//		scroll down last of the page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		takeScreenShot(wd, "def");
		wd.close();

    }
    public static void takeScreenShot(WebDriver wd, String fileName) throws IOException {
    	File file = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(file, new File("/Users/kamal/Downloads/Mphasis" + fileName + ".png"));
    }
}
