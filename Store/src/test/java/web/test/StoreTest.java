package web.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StoreTest {
    private WebDriver driver;

    @Before
    public void setUp(){
      //  WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1290,1080));

      }
    @After
    public void tearDown(){
        driver.quit();
      }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement loginButton = driver.findElement(By.cssSelector("[class ='login']"));
        loginButton.click();

        WebElement userTextField = driver.findElement(By.cssSelector("#email"));
        userTextField.sendKeys("adminin_secret@hotmail.com");

        WebElement passTextField = driver.findElement(By.cssSelector("#passwd"));
        passTextField.sendKeys("pa$$w0rd");

        WebElement singInButton = driver.findElement(By.cssSelector("#SubmitLogin"));
        singInButton.click();

        WebElement nameLabel = driver.findElement(By.cssSelector("[class ='sf-with-ul']"));
        nameLabel.click();

        WebElement fadedImg = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
        fadedImg.click();

        WebElement addCarButton = driver.findElement(By.cssSelector("[id='add_to_cart']"));
        addCarButton.click();

        WebElement checkButton = driver.findElement(By.cssSelector("[class='btn btn-default button button-medium']"));
        checkButton.click();

        WebElement procCheckButton1 = driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']"));
        procCheckButton1.click();
        WebElement procCheckButton2 = driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']"));
        procCheckButton2.click();
        WebElement procCheckButton3 = driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']"));
        procCheckButton3.click();
        WebElement procCheckButton4 = driver.findElement(By.cssSelector("[class='button btn btn-default standard-checkout button-medium']"));
        procCheckButton4.click();

    }

}
