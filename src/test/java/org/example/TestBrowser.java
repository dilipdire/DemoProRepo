package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		//ChromeOptions opts = new ChromeOptions();
	//	opts.addArguments("--remote-allow-origins=*");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testData()
	{
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void tearDown()
	{
		driver.close();
	}

}
