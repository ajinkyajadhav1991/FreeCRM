package HeadersTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HeadersPage;
import TestBase.TestBase;

public class HeaderTest extends TestBase{
	
  @Test
  public void verifyHeaderLogo() {
	  HeadersPage headersPage = new HeadersPage();
	  Assert.assertTrue(headersPage.verifyPresenceOfHeaderLogo(), "Logo is not present");
  }
}
