package myBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		String WindowID = driver.getWindowHandle();
		System.out.println(WindowID);

		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		Set<String> WindowIDs = driver.getWindowHandles();
		System.out.println(WindowIDs);

		Iterator<String> itr = WindowIDs.iterator();
		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!WindowID.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				String Title = driver.getTitle();
				System.out.println(Title);
				driver.findElement(By.xpath("//a[text()='Register now!']")).click();
			}
		}

	}

}
