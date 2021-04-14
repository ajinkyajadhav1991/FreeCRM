package TestBase;

import org.testng.annotations.Test;

import PageObjects.AbstractPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestBase {
	
  
  @BeforeMethod
  public void beforeMethod() {
	  AbstractPage.intialize();
	  AbstractPage.driver.get("https://www.freecrm.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  AbstractPage.driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
