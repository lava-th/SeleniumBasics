package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
       String value= driver.findElement(By.xpath("html[1]//body//main//div//div//div//div//div//div//div//div/h4/a")).getText();
        System.out.println(value);

        //String productname= driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
        //System.out.println(productname);




    }
}
