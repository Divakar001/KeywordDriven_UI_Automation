package com.learning.ActionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.learning.Utilities.ExcelUtilities;
import com.learning.constants.Constants;
import com.learning.executionCore.Engine;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeywords {
	static WebDriver driver;
	
		public static void openBrowser() {
			
			/*if(ExcelUtilities.DataColumn1.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
	}
			*/
		
		
			switch (ExcelUtilities.DataColumn1) {
			case Constants.CHROME:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case Constants.FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case Constants.EDGE:
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
		}}
		public static void goToURL() {
			driver.get(ExcelUtilities.DataColumn1);
			
		}
		public static void enterUsername() {
			driver.findElement(Engine.Locator).sendKeys(ExcelUtilities.DataColumn1);
			
		}
		public static void enterPassword() {
	
			driver.findElement(Engine.Locator).sendKeys(ExcelUtilities.DataColumn1);
			
		}
		/*
		public static void clickLogin() {
	
			driver.findElement(Engine.Locator).click();
			
		}*/
		/*
		public static void clickDirectory() {
			
			driver.findElement(Engine.Locator).click();
		}*/
			
		public static void click() {
			driver.findElement(Engine.Locator).click();;
			
		}
		public static void selectQALead() {
//			driver.findElement(By.id("searchDirectory_job_title")).click();
//			System.out.println("selectQALead");//searchDirectory_job_title
		
			WebElement Dropdown=driver.findElement(Engine.Locator);
			Select select=new Select(Dropdown);
			select.selectByVisibleText("QA Lead");}
		
		
		/*
		public static void clickSearch() {
			
			
			driver.findElement(Engine.Locator).click();
			
		}
		*/
		
		
	}
