package myBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/accessing-link.html";					
		WebDriver driver = new ChromeDriver();			
        		
        driver.get(baseUrl);	
        
        driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
//        driver.quit();	
        
        driver.navigate().back();
        
        driver.findElement(By.partialLinkText("here")).click();					
        System.out.println("Title of page is: " + driver.getTitle());							
        driver.quit();		
	}

}
