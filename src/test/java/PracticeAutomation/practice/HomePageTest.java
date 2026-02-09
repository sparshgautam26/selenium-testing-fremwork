package PracticeAutomation.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

	@Test(invocationCount = 3, threadPoolSize = 3 )
		public void titleVerify() {
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("Automation"),"Titile mismatch");
		}
	@Test(groups= {"regression"})
	public void verifyTextPresent() {
		String text = driver.findElement(org.openqa.selenium.By.xpath("//h1")).getText();

	        Assert.assertEquals(text, "Automation Testing Practice");
	}
	
	
	
	
	
	}
	
	
	
	

