package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/intel/Desktop/page1.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='doubleclick']"));

		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();

	}

}
