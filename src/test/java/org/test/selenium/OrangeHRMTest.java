package org.test.selenium;
/*Assignement
----------------
        1) Launch browser
2) open url
        URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
        3) Provide username  - admin@yourstore.com
        4) Provide password  - admin
        5) Click on Login button
        6) Verify the title of dashboard page
        Exp title : Dashboard / nopCommerce administration
        7) Verify Dasboad*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {
    public static void main(String[] args) throws InterruptedException {
        //Launch Browser
        WebDriver driver=new ChromeDriver();
        //Open url
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //Provide Username
      WebElement txtemailbox = driver.findElement(By.id("Email"));
      txtemailbox.clear();
      txtemailbox.sendKeys("admin@yourstore.com");
      Thread.sleep(5000);
      WebElement txtpassword=driver.findElement(By.name("Password"));
      txtpassword.clear();
      txtpassword.sendKeys("admin");
      Thread.sleep(5000);
      //driver.quit();


    }
}
