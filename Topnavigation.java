package com.Grow.GrowEng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Topnavigation {
	
		
		public WebDriver driver;
		
		@FindBy(xpath ="//a[@role='button']")
		public static WebElement butt;
		
		@FindBy(xpath = "//a[@href='https://www.growthengineering.co.uk/academy-lms/']")
		public static WebElement ourproduct;
		
		@FindBy(xpath = "//a[@href='https://www.growthengineering.co.uk/brain-science/']")
		public static WebElement ourapproach;
		
		@FindBy(xpath = "//a[@href='https://www.growthengineering.co.uk/resources/']")
		public static WebElement resources;
		
		@FindBy(xpath = "//a[@href='https://www.growthengineering.co.uk/about-growth-engineering/']")
		public static WebElement aboutus;
		
		@FindBy(xpath = "//a[@id='contact-button']")
		public static WebElement contact;
		
		public Topnavigation(WebDriver Adriver)
		{
			this.driver = Adriver;
			PageFactory.initElements(driver, this);
		}
		

	}




