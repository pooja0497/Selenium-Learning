package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();

	}

}
