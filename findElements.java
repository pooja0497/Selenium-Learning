package myBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		driver.close();
		int x = li.size(); 
		System.out.println(x);
		
	}

}
