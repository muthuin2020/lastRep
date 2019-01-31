package CollectionsFrameworkPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UtilityClasses.HighLightElement;

public class StaleEleFix {
	
@FindBy(how=How.XPATH, using="//input[@id='datepicker']") WebElement cal_ele;

public void clik() {
	cal_ele.click();
}
	  
}