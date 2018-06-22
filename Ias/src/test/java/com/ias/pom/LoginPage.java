package com.ias.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ias.utility.Utility;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String userName) throws IOException {
		driver.findElement(By.id("user_login")).sendKeys(userName);
				
	}

	public void enterPassword(String password) throws IOException {
		driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	public void clickSignIn() throws IOException {
		driver.findElement(By.id("wp-submit")).click();
	}
}
