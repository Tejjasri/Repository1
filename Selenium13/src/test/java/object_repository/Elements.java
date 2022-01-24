package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	public static String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	@FindBy(id="userName")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="submitBtn")
	public static WebElement login_button;
	
	@FindBy(id="fromPlaceName")
	public static WebElement From; 
	
	
	
	
	
	
	/*
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("userName"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement login_button(WebDriver driver) {
		return driver.findElement(By.id("submitBtn"));
	}
	
	*/
}
