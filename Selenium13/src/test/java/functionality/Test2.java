package functionality;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import object_repository.Elements;

public class Test2 {
	
	
	@Test
	public void login_fn() throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koyatejanaga.sri\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Elements.class);
		Elements.From.sendKeys("Chennai");
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/*
	
	@Test
	public void login_fn() throws InterruptedException, BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koyatejanaga.sri\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(Elements.url);
		PageFactory.initElements(driver, Elements.class);
		
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		 js3.executeScript("scroll(0,300)");
		 
		//Elements.resister_email.sendKeys(Elements.usernamer);
		//Elements.register_button.click();
		//if(Elements.Error_text.isDisplayed(/
		 
		Workbook w1=Workbook.getWorkbook(new File("C:\\Users\\koyatejanaga.sri\\eclipse-workspace\\CaseStudy\\data.xlsx"));
		Sheet s1=w1.getSheet(0);
		for(int i=1;i<s1.getRows();i++) {
			String username1=s1.getCell(0, i).getContents();
			Elements.resister_email.sendKeys(username1);
			Elements.register_button.click();
		}
	*/
}
