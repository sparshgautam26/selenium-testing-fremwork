package PracticeAutomation.practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormTest extends BaseTest  {

	@Test(groups = {"smoke", "regression"})
    public void fillFormTest() {

        driver.findElement(By.id("name")).sendKeys("Sparsh");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9999999999");
        driver.findElement(By.id("textarea")).sendKeys("Automation practice");

        Assert.assertTrue(
            driver.findElement(By.id("name")).isDisplayed(),
            "Name field not visible");
	
}
}