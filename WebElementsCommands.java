package myBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Java Selenium");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).clear();
		WebElement ele = driver.findElement(By.xpath("(//a[@class='gb_V'])[1]" ));
		boolean flag = ele.isDisplayed();
		boolean flag2 = ele.isEnabled();
		System.out.print(flag + " " + flag2);
		if(ele.isDisplayed()) {
			ele.click();
		}
		
		

	}

}
