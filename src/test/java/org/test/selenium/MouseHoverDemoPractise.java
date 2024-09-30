package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverDemoPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        WebElement desktops= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        //Mouse hover
        Actions act=new Actions(driver);
        //act.moveToElement(desktops).moveToElement(mac).click().build().perform();
        act.moveToElement(desktops).moveToElement(mac).click().perform();
    }
}
