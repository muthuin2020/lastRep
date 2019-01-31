package CollectionsFrameworkPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class WebdriverListenerClass {
  @Test
  public void webDrListener() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Drivers\\ChromeDriver.exe");
	  WebDriver a1=new ChromeDriver();
	 
	  EventFiringWebDriver eve1=new EventFiringWebDriver(a1);
	  WebDriverListener wb=new WebDriverListener();
	  eve1.register(wb);
	  eve1.manage().window().maximize();
	  eve1.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");	
	  eve1.getTitle();
	  eve1.findElement(By.id("datepicker")).click();
		
		System.out.println("Table rows : "+eve1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size());
		
		List<WebElement> we=eve1.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		System.out.println("Table dates : "+we.size());
		
		for(WebElement w1:we) {
			
			System.out.println(w1.getText());
			if(w1.getText().equals("25")) {
				w1.click();
				break;
			}
			
		}
		
		System.out.println("Selecyted date2 is : "+eve1.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value"));
	}
  }

