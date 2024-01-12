package Selenium.seleniumWebEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewApp {

//	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver wd = new ChromeDriver();
//
//		wd.manage().window().maximize();
//		
//		wd.get("https://www.amazon.in/");
//		
//		Screen sc = new Screen();
//		Pattern p1 = new Pattern("/Users/kamal/Downloads/Mphasis/sikuli/1.png");
//		sc.type(p1, "samsung");
//		
//		Pattern p2 = new Pattern("/Users/kamal/Downloads/Mphasis/sikuli/2.png");
//		sc.click(p2);
//	}
	
	public static void main( String[] args ) throws FindFailed {
    	//register the webdriver =>browser vendor 
    			WebDriverManager.chromedriver().setup();
    			//creating an object to the object
    			WebDriver wd=new ChromeDriver();
    			//maximize the browser
    			wd.manage().window().maximize();

    			//webpage timebound 

			//go to browser and open this url 
    			wd.get("https://www.ilovepdf.com/pdf_to_word");

    			Screen sc=new Screen();
    			Pattern p1=new Pattern("/Users/kamal/Downloads/Mphasis/sikuli/3.PNG");
    			sc.click(p1);
    			Pattern p2=new Pattern("/Users/kamal/Downloads/Mphasis/sikuli/4.PNG");
    			sc.type(p2,"/Users/kamal/Downloads/Mphasis/sikuli/test.pdf");

    }


}
