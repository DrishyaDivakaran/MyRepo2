package com.crm.orgaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgTest {
	
	
	@Test(groups="smoke")
	public void createOrgaTest()
	{
		
		String browser = System.getProperty("BROWSER");
		String url=System.getProperty("URL");
		System.out.println("create organization");		
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.navigate().back();
		driver.close(); 
		 		
	}
   
		@Test(groups="regression")
		public void modifyOrgaTest()
		{
			System.out.println(" modify  organization2");
		}

}
