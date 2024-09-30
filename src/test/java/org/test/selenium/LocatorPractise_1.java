package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractise_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //open url
        driver.get("https://www.javatpoint.com/selenium-interview-questions");
        driver.manage().window().maximize();//chain methods//to maximize the chrome
        Thread.sleep(6000);
        //search box
        //driver.findElement(By.id("gsc-i-id1")).sendKeys("javascript");
        Thread.sleep(5000);
        //search button by using tag and class selector
        //driver.findElement(By.cssSelector("td.gsc-search-button")).click();
       // Thread.sleep(5000);
        ////link text & partial linktext
        //driver.findElement(By.linkText("Interview Tips")).click();
        driver.findElement(By.partialLinkText("Interview "));


        /*//Provide Username -Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(5000);
        //provide the password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='oxd-input oxd-input--active']")).sendKeys("Admin");*/
        //driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/div/div/input")).sendKeys("Admin");
        //oxd-input
        ////*[@id="app"]/div[1]/div[1]/aside/nav/div[2]/div/div/input
        //'input.oxd-input oxd-input--active'
    }
}
