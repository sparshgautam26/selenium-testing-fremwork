package PracticeAutomation.practice;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

   
    @Override

    public void onTestFailure(ITestResult result) {

        WebDriver driver = BaseTest.driver;

        if (driver == null) {
            System.out.println("Driver is NULL, screenshot not taken");
            return;
        }

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/"
                    + result.getName() + ".png");

            FileHandler.copy(src, dest);

            System.out.println("Screenshot saved");

        } catch (Exception e) {
            e.printStackTrace();
        }}}
    
