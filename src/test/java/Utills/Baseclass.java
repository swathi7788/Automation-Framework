package Utills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Baseclass extends driverFactory{

    public static void clickElement(By locatorName) {
        driver.findElement((By) locatorName).click();
    }

    public static void enterInput(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public static void assertURL(String expected) {
        assertEquals(driver.getCurrentUrl(), expected); ;
    }
    public static void assertURLContains(String expected) {
        assertTrue(driver.getCurrentUrl().contains(expected)) ;
    }
}
