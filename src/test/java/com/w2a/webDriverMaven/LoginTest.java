package com.w2a.webDriverMaven;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\UDEMY\\SaturdayLiveProject\\webDriverMaven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		wait = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("monikazade@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();     
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("abhishekmonika16");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']")).click();
	}
		@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
}
