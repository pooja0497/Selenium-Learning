package myBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]"));
		Point p = ele1.getLocation();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
