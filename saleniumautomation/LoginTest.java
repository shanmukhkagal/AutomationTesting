package com.saleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {
	 
	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_source");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
		
	}
}
