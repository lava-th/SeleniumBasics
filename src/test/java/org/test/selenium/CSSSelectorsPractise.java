package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        ////css with tag & id
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");

        //tag class
        // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Macbook");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Macbook");


//tag and attributes
        //driver.findElement(By.cssSelector("input[name='q'")).sendKeys("Macbook");



        //tag class&attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");

    }
}
