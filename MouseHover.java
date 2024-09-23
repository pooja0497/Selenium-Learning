package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Two Wheelers']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Petrol Vehicles']")).click();
		
		}

}
