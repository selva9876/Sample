package org.bank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleJenkins {
	@Test
	private void tc01() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
//		WebElement upload=driver.findElement(By.xpath("(//*[text()='Upload Resume'])[1]"));
//		upload.click();
//		WebElement uploadfile=driver.findElement(By.xpath("//*[@type='file']"));
//		uploadfile.sendKeys("E:\\jenkinpom.txt");

		WebElement upload = driver.findElement(By.xpath("(//*[text()='Upload Resume'])[1]"));
		upload.click();
		WebElement uploadfile = driver.findElement(By.xpath("(//*[@id='file-upload'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",uploadfile);
		Robot r = new Robot();
		StringSelection ss = new StringSelection("E:\\Test.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Done");

	}

}
