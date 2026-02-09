package PracticeAutomation.practice;

import org.testng.annotations.AfterSuite;

public class AfterSuiteCleanup {

    @AfterSuite
    public void cleanUp() {
        if (BaseTest.driver != null) {
            BaseTest.driver.quit();
        }
    }
}
