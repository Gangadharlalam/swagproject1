import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookExampleSelenium {
    ChromeDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void googleTest() throws InterruptedException {

//        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@123");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@123");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input._9ls7")).sendKeys("123456");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc3455");
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("11111");
//        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("hcdshsghf");
        Thread.sleep(1000);
       driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("111111");
       Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[name=login]")).click();
        Thread.sleep(2000);




    }
    @AfterClass
    void close() {
      // driver.close();

    }
}
