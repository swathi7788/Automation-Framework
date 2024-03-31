package Utills;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class driverFactory {

    protected static WebDriver driver=null;
    public static Properties prop;

    public driverFactory(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            //System.setProperty("webdriver.gecko.driver", "/Users/);
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));

        driver.get(prop.getProperty("url"));

    }

    @AfterSuite
    public void teardown(){
        driver.quit();
    }


  //  Properties prop;


}
