package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractWithElementUsingJS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        //ChromeDriver driver=new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;


        //First name--inputbox
       WebElement inputbox= driver.findElement(By.id("field1"));

       js.executeScript("arguments[0].setAttribute('value','john')",inputbox);

       //Radio button
        WebElement male_rd=driver.findElement(By.id("female"));
        male_rd.click();//Click Intercepted exception
        js.executeScript("arguments[0].click();",male_rd);


        //Checkbox
       WebElement chkbox=driver.findElement(By.id("saturday"));
       js.executeScript("arguments[0].click();",chkbox);
        driver.switchTo().frame(0);

        //button
        WebElement button=driver.findElement(By.xpath("//input[@id='FSsubmit']"));
        js.executeScript("arguments[0].click();",button);
        //input[@id='FSsubmit']

    }
}
