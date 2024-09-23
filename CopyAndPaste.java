package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='userName']"));
		ele1.sendKeys("Pooja");
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='userEmail']"));
		ele2.sendKeys("pooja8435@gmail.com");
		WebElement ele3 = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		ele3.sendKeys("New Koradi house no.E104");
		Actions act = new Actions(driver);
		
		///SELECT ENTIRE CONTENT///
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		///COPY ENTIRE CONTENT///
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		///PRESSING THE TAB BUTTON TO FOCUS///
		act.sendKeys(Keys.TAB);
		act.build().perform();
		Thread.sleep(3000);
		
		///COPY ENTIRE CONTENT///
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		

	}

}
