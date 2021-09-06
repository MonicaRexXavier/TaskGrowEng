package com.Grow.GrowEng;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basegrowth {
public static WebDriver driver;//---null driver
public static WebDriver getDriver(String browser) {
	
	
		//if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harmo\\eclipse-workspace\\SeleniumTesting\\Driver1\\chromedriver.exe");
	 driver = new ChromeDriver();
		
	//	}
	
   // else if(browser.equalsIgnoreCase("safari"))
     //{

	 
		// System.setProperty("webdriver.safari.driver","C:\\Users\\harmo\\eclipse-workspace\\SeleniumTesting\\Drivers\\safari.exe");
		
		// WebDriver driver =new SafariDriver();
	 //}
	 //}
		
	
	 
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 return driver;
}

public static void getUrl(String url)throws Exception {
	
	//try {
		driver.get(url);
	//}catch(Exception e) {
	//	e.printStackTrace();
	//	throw new Exception("url is not present");
	//}
	
}

public static void mouseOver(WebElement element) throws Exception {
	waitforvisibilityofelement(element);
	try {
		
		Actions ac = new Actions(driver);
		if(elementisDisplayed(element) && elementisEnabled(element)) {
			
	ac.moveToElement(element).build().perform();
		}
}catch(Exception e) {
e.printStackTrace();
	throw new Exception("If the element is not present");
}
	}
//get Current Url
public static String getCurrentUrl()throws Exception {
	String cur = null;
	try {
		cur = driver.getCurrentUrl();
		System.out.println(cur);
	}catch(Exception e) {
		e.printStackTrace();
		throw new Exception("url is not present");
	}
	return cur;
}

//scroll
public static void scroll(WebElement element1)throws Exception {
	try {
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(),", element1);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
//send keys
public static void sndk(WebElement element,String value)throws Exception {
	waitforvisibilityofelement(element);
	try {
			if(elementisDisplayed(element) && elementisEnabled(element)) {
			      element.clear();
			      element.sendKeys(value);
	
		}
}catch(Exception e) {
	e.printStackTrace();
	throw new Exception("values are not present");
}
	}
//get title
public static String getTitle1()throws Exception {
	String title = null;
	try {
		title= driver.getTitle();
		System.out.println(title);
	}catch(Exception e) {
		e.printStackTrace();
		throw new Exception("title is not present");
	}
	return title;
}
//drop down
public static void dropdown(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByValue(value);
}
//	if(value.equals("index")) {
//		s.selectByIndex(i);
//	}else if(value.equals("value")) {
//		s.selectByValue(value);
//	}else if(value.equals("text")) {
//		s.selectByVisibleText(value);
//	}

//dropdown visibleText
public static void dropdown1(WebElement element,String value) {
	Select s = new Select(element);
	s.selectByVisibleText(value);
}

//to click
public static void clk(WebElement element) {
	element.click();
}
//get options
public static void getoptions(WebElement element){
	Select s1 = new Select(element);
	List<WebElement> options = s1.getOptions();
	for(WebElement opt:options)
	{
		System.out.println(opt.getText());
	}
}
//first selected option
public static void firstgetoption(WebElement element){
	
	Select s2 = new Select(element);
	WebElement option = s2.getFirstSelectedOption();
	System.out.println(option.getText());
}
//window Handles
public static void win(WebElement element) {
	String childid = driver.getWindowHandle();
	element.click();
	Set<String> parentid = driver.getWindowHandles();
	String y = null;
	for(String d:parentid)
	{
		if(!d.equals(childid)) {
			y=d;
		}
	}
	driver.switchTo().window(y);
}
//Robot class
public static void robot(WebElement element) throws Exception {
	Actions act = new Actions(driver);
	act.contextClick(element).build().perform();
	
	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
//alert
public static void Alertsss(WebElement element,String var) {
	element.click();
	Alert alert = driver.switchTo().alert();
	if(var=="accept") {
		alert.accept();
		driver.switchTo().defaultContent();
	}else {
		alert.dismiss();
		driver.switchTo().defaultContent();
	}
}
public static void clos(WebElement element)
{
	driver.close();
}
//explicit wait
public static void waitforvisibilityofelement(WebElement element) {
	try {
		WebDriverWait wb = new WebDriverWait(driver,30);
		wb.until(ExpectedConditions.visibilityOf(element));
	}catch(Exception e) {
		e.printStackTrace();
	}
}
//is displayed	
	public static boolean elementisDisplayed(WebElement element)
	{
		boolean displayed =false;
		try {
			displayed = element.isDisplayed();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return displayed;
	}
	//is Enabled
	public static boolean elementisEnabled(WebElement element)
	{
		boolean enable =false;
		try {
			enable = element.isEnabled();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return enable;
	}
	
	
}
