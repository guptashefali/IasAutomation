package com.ias.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ias.utility.Utility;

public class DriverInstance {

	public WebDriver driver;

	@BeforeMethod
	public void initiateDriverInstance() throws IOException {

		if (Utility.fetchPropertyValue("browser").toString()
				.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					".\\src\\test\\resources\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
					".\\src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}

	@AfterMethod
	public void closeDriverInstance() {

	}
}
