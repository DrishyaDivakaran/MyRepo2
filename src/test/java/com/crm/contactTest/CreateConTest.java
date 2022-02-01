package com.crm.contactTest;

import org.testng.annotations.Test;

public class CreateConTest {
	
	
	@Test(groups="regression") 
	public void createContactTest() {
		System.out.println("executr create contact test");
	}
	
	@Test(groups="smoke")
	public void modifyCreateContactTest()
	{
		System.out.println("modify create contact test");
	}
	
	

	@Test(groups="ful")
	public void deleteContactTest()
	{
		System.out.println("modify after delete contact test");
	}

}
