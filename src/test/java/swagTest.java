package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class swagTest   {
    ChromeDriver driver = new ChromeDriver();
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); //for window to maximize
    }
    @Test
    public void googleTest() throws InterruptedException {

//        driver.findElement(By.name("user-name")).sendKeys("standard_user");//user-name
//        Thread.sleep(1000);
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");//user-name
//        Thread.sleep(3000);
//        driver.findElement(By.name("login-button")).click();
//        Thread.sleep(3000);
//
//
//        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();  //By using linkText
//        // driver.findElement(By.partialLinkText("Sauce")).click();            //By using partialLinkText
//
//        Thread.sleep(3000);
//        driver.findElement(By.tagName("button")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.id("shopping_cart_container")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("checkout")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("firstName")).sendKeys("gangadhar");
//        Thread.sleep(2000);
//        driver.findElement(By.name("lastName")).sendKeys("Anc123@");
//        Thread.sleep(2000);
//        driver.findElement(By.name("postalCode")).sendKeys("11111");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("standard_user");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("secret_sauce");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-name' or name='user-name2']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);



    }
    @AfterClass
    void close(){
        driver.close();
    }


}