package script;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import lib.BaseTest;

public class TestCase extends BaseTest {
	
	@Test
	public void testcase() throws InterruptedException{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown']"))).perform();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hotels   ']")));
		driver.findElement(By.xpath("//span[text()='Hotels   ']")).click();
		System.out.println("This is first Test case");
	}

}
