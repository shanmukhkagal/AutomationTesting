package com.saleniumautomation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Registration {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a choice");
		System.out.println("1.Google Chrome+\n"+"2.Microsoft edge");
		int ch = input.nextInt();
		switch(ch) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Famazonprime%3F_encoding%3DUTF8%26sr%3D53-1%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			driver.manage().window().maximize();
			   
			driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Vinayak Honavar");
			driver.findElement(By.id("ap_email")).sendKeys("vinayaknaik4196gmail.com");
			driver.findElement(By.name("password")).sendKeys("12334587");
			   
			File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShotFile, new File(".//screenshots/screen.png"));
			System.out.println("Working successfully");
		        driver.close();
		        break;
			
		case 2:System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win32\\msedgedriver.exe");
		       EdgeDriver EdgeDriver = new EdgeDriver();
		       EdgeDriver.get("https://www.saucedemo.com/");
                       EdgeDriver.manage().window().maximize();
			   
                       EdgeDriver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Vinayak Honavar");
                       EdgeDriver.findElement(By.id("password")).sendKeys("565656");
               
                       File screenShotFile1 = ((TakesScreenshot) EdgeDriver).getScreenshotAs(OutputType.FILE);
		       FileUtils.copyFile(screenShotFile1, new File(".//screenshots1/screen.png"));
		       System.out.println("Working successfully");
		       EdgeDriver.close();
		       break;
		       
		       
		default:System.out.println("Invalid choice");
		
		}
	}
}
