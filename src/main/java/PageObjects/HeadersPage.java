package PageObjects;

import org.openqa.selenium.By;

public class HeadersPage  extends AbstractPage{
	
	
	//Locators
	private String headerLogo() {
		return "brand-name";  //className
	}
	
	private String aboutLink() {
		return "//a[text()='About']"; //xpath
	}
	
	
	//Methods
	public boolean verifyPresenceOfHeaderLogo() {
		return driver.findElement(By.className(headerLogo())).isDisplayed();	
	}
	
	public void clickAboutLink() {
		driver.findElement(By.xpath(aboutLink())).click();
	}

}
