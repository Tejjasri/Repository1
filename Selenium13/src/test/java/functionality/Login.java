package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import object_repository.Elements;

public class Login {
	
	@Test
	public void login_fn() throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koyatejanaga.sri\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
		
		/*
		Elements el=new Elements();//calling webElements by creating objects
		el.username(driver);
		el.password(driver);
		el.login_button(driver);
		*/
		
		/*
		Elements.username(driver).sendKeys("tejonagasri@gmail.com");//calling webElements directly using classNames
		Elements.password(driver).sendKeys("hcl@1234");
		Elements.login_button(driver).click();
		*/
		
		
		PageFactory.initElements(driver, Elements.class);//another way of creating an object---if there are multiple classes then use {} and seperate them wih ,
		Elements.username.sendKeys("tejonagasri@gmail.com");
		Elements.password.sendKeys("hcl@1234");
		Elements.login_button.click();
		
		/*
		//taking screenshot - no full screen is not capturing(drawback)
		TakesScreenshot tk1=(TakesScreenshot) driver;
		File Source=tk1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\koyatejanaga.sri\\eclipse-workspace\\Selenium13\\Screenshots\\screen1.jpg");
		FileHandler.copy(Source, destination);
		*/
		
		//to capture full screen along with url we use robot class
		Robot robo=new Robot();
		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc_size);
		BufferedImage Source=robo.createScreenCapture(rect);//to save the time instead of taking snaps pixl by pixl we use buffered image
		File destination=new File("C:\\Users\\koyatejanaga.sri\\eclipse-workspace\\Selenium13\\Screenshots\\screen2.jpg");
		ImageIO.write(Source, "png", destination);
	}
	

}
