package main;

import java.io.FileInputStream;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticingTest {
  @Test
  public void f() throws Exception {

		  System.out.println("Test");
		  
	  } 
  @BeforeSuite
  public void f4() throws Exception {

		  System.out.println("Suite Test");
		  
	  } 
  
  @BeforeClass
  public void f3() throws Exception {

		  System.out.println("Class Test");
		  
	  } 
  
  @AfterMethod
  public void f1() throws Exception {

		  System.out.println("After Test");
		  
	  } 
  @BeforeMethod
  public void f2() throws Exception {

		  System.out.println("Before Test");
		  
	  } 

  
}
