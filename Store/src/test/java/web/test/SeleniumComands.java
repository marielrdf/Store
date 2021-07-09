package web.test;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumComands {

    @Test
    public void testSeleniumElements(){

        System.setProperty("webserver.chrome.driver", "C:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
         ChromeOptions chromeOptions =  new ChromeOptions();
         chromeOptions.addArguments("--headless");
     //    WebDriver driver = new ChromeDriver(chromeOptions);
         driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("http://automationpractice.com/index.php");
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.quit();

    }

}