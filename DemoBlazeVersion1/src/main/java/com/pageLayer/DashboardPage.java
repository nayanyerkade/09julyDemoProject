package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------Obj --------------------
	private By search_txt = By.xpath("//input[@class='form-control']");
	private By company_option = By.xpath("(//div[@class='m-4 card'])[2]");
	
	//----------Action method -------------
	
	public void enterCompanyName(String company_name)
	{
		driver.findElement(search_txt).sendKeys(company_name);
	}
	
	public void clickOnCompanyOption()
	{
		driver.findElement(company_option).click();
	}
	
	

}
