package CollectionsFrameworkPractice;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import UtilityClasses.HighLightElement;

public class Pomtest {
	
    WebDriver a1;
    ExtentReports er;
    ExtentTest et;
   
   
  @BeforeClass
  public void initDriver() {
	   er=new ExtentReports(System.getProperty("user.dir")+"\\reports\\report1.html");
	   et=er.startTest("select calender");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Drivers\\ChromeDriver.exe");
	  a1=new ChromeDriver();
	  a1.manage().window().maximize();
	  et.log(LogStatus.PASS, "Broweser launched");

	  
	  }
    
@Test(enabled=false)
public void launch() {

	 a1.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
	 
	 WebElement wb1=a1.findElement(By.xpath("//a[text()='mukeshotwani@learn-automation.com']"));
	 
	 
	 a1.findElement(By.xpath("//a[@id='sendx-close-dNnOns5gBj56SFGkOimE4p']")).click();
		int n=a1.findElements(By.tagName("iframe")).size();
		
		System.out.println("Tag numbers"+n);
	 
	 System.out.println(wb1.getLocation());
	 System.out.println(wb1.getLocation().getX());
	 wb1.getSize();
	  
  }

@Test
public void datePicker() throws InterruptedException {
	

	a1.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");	
	et.log(LogStatus.PASS, "website opened");
	
	StaleEleFix sl=PageFactory.initElements(a1, StaleEleFix.class);	
	

	HighLightElement.highLightElement(a1, sl.cal_ele);
	//a1.findElement(By.xpath("//a[text()='View my complete profile']")).click();
	//Thread.sleep(4000);
	//a1.navigate().back();
	//a1.navigate().refresh();
	sl.clik();
	String s1="ui-datepicker-";
	//System.out.println("Table rows : "+a1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size());
	System.out.println("Table rows : "+a1.findElements(By.xpath("//table[@class='"+s1+"calendar']/tbody/tr")).size());
	
	List<WebElement> we=a1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
	System.out.println("Table dates : "+we.size());
	
	for(WebElement w1:we) {
		HighLightElement.highLightElement(a1, w1);
		System.out.println(w1.getText());
		if(w1.getText().equals("11")) {
			w1.click();

			et.log(LogStatus.PASS,et.addScreenCapture("C:\\\\Users\\\\HP\\\\Downloads\\\\Drivers\\\\scrnShot.png"+"Date selected"));
			
			break;
		}
		
	}
	
	System.out.println("Selected date is : "+a1.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value"));
	er.endTest(et);
	er.flush();
	a1.get(System.getProperty("user.dir")+"\\reports\\report1.html");
}

@Test(enabled=false)
public void screenShot() throws HeadlessException, AWTException, IOException, InterruptedException {
	
	
	Thread.sleep(3000);
	System.out.println(a1.getTitle());
	
	System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
	
Dimension d1=new Dimension(1360, 720);
	//Rectangle r1=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());	
	new Robot().mouseWheel(10);
	Rectangle r1=new Rectangle(d1);
	BufferedImage bi=new Robot().createScreenCapture(r1);
	 
	ImageIO.write(bi, "png", new File("C:\\\\Users\\\\HP\\\\Downloads\\\\Drivers\\\\scrnShot.png"));
	}


@AfterMethod
public void tearDown(ITestResult result)
{
 
// Here will compare if test is failing then only it will enter into if condition
if(ITestResult.FAILURE==result.getStatus())
{
System.out.println("Itestresult failed");

}

}
}