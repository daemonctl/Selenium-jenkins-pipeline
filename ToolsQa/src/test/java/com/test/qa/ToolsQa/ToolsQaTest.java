package com.test.qa.ToolsQa;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaTest extends PageObjects {
	WebDriver driver;
	WebDriverManager manager;
	long waiting = 2000;
	String windows = ".\\Screenshots\\";
	String linux = "./Screenshots/";

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("headless");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(PageObjects.baseUrl);
		Thread.sleep(waiting);
		PageObjects.firstName(driver).click();
		PageObjects.firstName(driver).sendKeys("Korhan");
		Thread.sleep(waiting);
		PageObjects.surnameName(driver).click();
		PageObjects.surnameName(driver).sendKeys("Herguner");
		Thread.sleep(waiting);
		PageObjects.sex(driver).click();
		Thread.sleep(waiting);
		PageObjects.years(driver).click();
		Thread.sleep(waiting);
		PageObjects.date(driver).click();
		Thread.sleep(waiting);
		PageObjects.date(driver).sendKeys("30/10/2017");
		Thread.sleep(waiting);
		PageObjects.profession(driver).click();
		Thread.sleep(waiting);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (ITestResult.SUCCESS == result.getStatus()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(linux + result.getName() + System.currentTimeMillis() + ".png"));
		}
		driver.quit();
	}

}
