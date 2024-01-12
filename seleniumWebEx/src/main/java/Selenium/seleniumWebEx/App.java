package Selenium.seleniumWebEx;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
    	//register the web driver =>browser vendor 
    	WebDriverManager.chromedriver().setup();
    	
    	//creating an object to the object
    	WebDriver wd = new ChromeDriver();
    	
    	//maximize the browser
    	wd.manage().window().maximize();
    	
//    	wd.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS);
    	wd.get("https://www.flipkart.com");
//    	takeScreenShot(wd, "abc");
//    	wd.findElement(By.xpath("/html/body/button")).click();
    	//go to browser and open this url 
    	
    	//Accessing alert 
//    	Alert alert = wd.switchTo().alert();
//    	alert.accept();	
//    	System.out.println(alert.getText());
//    	Thread.sleep(5000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) wd;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	takeScreenShot(wd, "def");
    	
    	wd.close();
    	
//    	wd.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    	
//    	WebElement we1=wd.findElement(By.linkText("Start here."));             
//		explictLink(wd,we1,200);
//		WebElement we2=wd.findElement(By.id("ap_customer_name"));
//		explictField(wd,we2,400,"abcd");

    	
    	//It will take 5 seconds before closing the browser automatically
//    	Thread.sleep(5000);
    	
    	
    	//finding elements by id
//    	wd.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
    	
    	//clicking on the button 
//    	wd.findElement(By.id("nav-search-submit-button")).click();	  
    	
    	//finding element by XPath
//    	wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    	//close browser
//    	wd.close();
    	
    	//finding and supplying data to webapplications in our system 
    	
//    	wd.get("http://localhost:4200/dash");
//    	
//    	wd.findElement(By.xpath("/html/body/app-root/app-dashboard/app-home/ul/li[2]/a"	)).click();
//    	
//    	wd.findElement(By.xpath("/html/body/app-root/app-list-emp/div/button")).click();
//    	
//    	wd.findElement(By.xpath("//*[@id=\"empId\"]")).sendKeys("24");
//    	wd.findElement(By.name("empName")).sendKeys("Rao Sahab");
//    	wd.findElement(By.name("empEmail")).sendKeys("rao@s.c");
//    	wd.findElement(By.name("employee_salary")).sendKeys("120000");
//    	wd.findElement(By.name("empAge")).sendKeys("25");
//    	wd.findElement(By.xpath("/html/body/app-root/app-add-emp/div/form/button")).click();
//    	
//    	
//    	ChromeOptions options = new ChromeOptions(); 
//    	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
//    	WebDriver driver = new ChromeDriver(options); 
		
		
    	
    }

//    private static void explictLink(WebDriver wd, WebElement we1, int timeout) {
//		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we1));
//		we1.click();
//	}
//	private static void explictField(WebDriver wd, WebElement we2, int timeout, String value) {
//		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we2));
//		we2.sendKeys(value);
//
//	}
    
    public static void takeScreenShot(WebDriver wd, String fileName) throws IOException {
    	File file = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(file, new File("/Users/kamal/Downloads/Mphasis/" + fileName + ".png"));
    }
	
}

