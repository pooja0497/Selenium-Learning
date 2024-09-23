package myBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String  currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String  pageSource = driver.getPageSource();
		System.out.println(pageSource);
//		driver.close();

	}

}
