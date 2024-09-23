package myBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select oSelect = new Select(ele);
//		oSelect.selectByIndex(3);
//		oSelect.selectByVisibleText("Android");
//		oSelect.selectByValue("Android");
//		driver.close();
		
		List<WebElement> li = oSelect.getOptions();
		int x=li.size();
		System.out.println("size is :" + x);
		
		for(int j=0;j<x;j++) {
			System.out.println(li.get(j).getText());
			
		}

	}

}
