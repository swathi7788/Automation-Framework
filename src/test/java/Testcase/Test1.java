package Testcase;

import Utills.Baseclass;
import org.testng.annotations.Test;
import pages.pageclass;

public class Test1 extends Baseclass {

    pageclass page = new pageclass(driver);

    @Test
    public void launchWebsite(){
        initialization();
        //base.assertURL("www.google.com");
        assertURLContains("amazon");
        page.typeSearchQuery("iphone");
        page.clickSearchBtn();
    }
}
