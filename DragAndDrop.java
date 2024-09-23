package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement Src  = driver.findElement(By.xpath("//img[@id='drag1']"));
		WebElement Target  = driver.findElement(By.xpath("//div[@id='div2']"));
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.dragAndDrop(Src, Target).build().perform();

	}

}
