package com.test.qa.ToolsQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	WebDriver driver;
	public static WebElement element;
	public static String baseUrl = "http://toolsqa.com/automation-practice-form/";

	public static WebElement firstName(WebDriver driver) {
		return element = driver.findElement(By.name("firstname"));
	}

	public static WebElement surnameName(WebDriver driver) {
		return element = driver.findElement(By.name("lastname"));
	}

	public static WebElement sex(WebDriver driver) {
		return element = driver.findElement(By.id("sex-0"));
	}

	public static WebElement years(WebDriver driver) {
		return element = driver.findElement(By.id("exp-0"));
	}

	public static WebElement date(WebDriver driver) {
		return element = driver.findElement(By.id("datepicker"));
	}

	public static WebElement profession(WebDriver driver) {
		return element = driver.findElement(By.id("profession-0"));
	}
}
