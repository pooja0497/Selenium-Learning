package myBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File SrcFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File("C:\\Users\\intel\\Pictures\\Saved Pictures\\test1.jpeg");
//		File DestFile = new File("C:\\Users\\intel\\Pictures\\Saved Pictures\\"+Math.random()+"test1.jpeg");
//		File DestFile = new File("C:\\Users\\intel\\Pictures\\Saved Pictures\\"+Math.random()+"Scene1"+"test1.jpeg");
		
		FileUtils.copyFile(SrcFile, DestFile);
		
	}

}
