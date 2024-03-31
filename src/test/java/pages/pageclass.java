package pages;

import Utills.Baseclass;
import Utills.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass extends Baseclass {

    By searchBox = By.id("twotabsearchtextbox");
    By locBy = By.xpath("loc");

    By searchBtn = By.id("nav-search-submit-button");


    public pageclass(WebDriver driver) {
        driverFactory.driver =  driver;
    }

    public void typeSearchQuery(String value) {
        enterInput(searchBox, value);
    }

    public void clickSearchBtn() {
        clickElement(searchBtn);
    }
}
