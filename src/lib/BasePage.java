package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle){
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("PASS : The title is matching",true);
		}catch(Exception e){
			Reporter.log("PASS : The title is matching",true);
			Assert.fail();
		}
	}
}
