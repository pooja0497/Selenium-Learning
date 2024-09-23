package myBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select obj = new Select(ele);
		if (obj.isMultiple() == true) {
			obj.selectByIndex(0);
			obj.selectByIndex(1);
			obj.selectByIndex(2);
		}
		Thread.sleep(3000);
		List<WebElement> li = obj.getAllSelectedOptions();
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
		WebElement ele2 = obj.getFirstSelectedOption();
		System.out.println("selected option :" + ele2.getText());
		obj.deselectByIndex(1);  

	}

}
