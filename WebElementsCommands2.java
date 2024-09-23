package myBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[1]"));
		String val = ele.getText();
		System.out.println(val);
		WebElement ele1 = driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]"));
		String val1 = ele1.getAttribute("class");
		System.out.println(val1);
		Dimension d = ele1.getSize();
		System.out.println("size of web element is " + d);
		System.out.println("heigth of web element is " + d.getHeight());
		System.out.println("heigth of web element is " + d.getWidth());
		
		 //////isSelected Example//////
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		ele2.click();
		boolean select = ele2.isSelected();
		System.out.println(select);
		
	//////getTagName//////
		
		WebElement ele3 = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		String tagName = ele3.getTagName();
		System.out.println(tagName);

	}

}
