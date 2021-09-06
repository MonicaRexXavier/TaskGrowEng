package com.Grow.GrowEng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='full_name']")
	public static WebElement fullname;
    
	@FindBy(xpath = "//input[@name='email']")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@type='tel']")
	public static WebElement tele;
	
	@FindBy(xpath = "//input[@name='company']")
	public static WebElement company;
	
	@FindBy(xpath = "//select[@id='country_-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
	public static WebElement country;
	
	@FindBy(xpath = "//li[@role='radio']")
	public static WebElement leaners;
	
	@FindBy(xpath = "//select[@name='role_description']")
	public static WebElement role;
	
	@FindBy(xpath = "//select[@name='what_is_the_purpose_of_your_enquiry_']")
	public static WebElement enquiry;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public static WebElement check;
	
	public Contactpage(WebDriver Adriver)
	{
		this.driver = Adriver;
		PageFactory.initElements(driver, this);
	}


}



