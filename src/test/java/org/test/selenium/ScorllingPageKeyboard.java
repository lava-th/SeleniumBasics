package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScorllingPageKeyboard {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //1)scroll down page by pixel
//        js.executeScript("window.scrollBy(0,3000)","");
//        System.out.println(js.executeScript("return window.pageYOffset;"));//
//2)Scroll down the page till the element is present
//        WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of North Macedonia']"));
//                js.executeScript("arguments[0].scrollIntoView();",flag);
//        System.out.println(js.executeScript("return window.pageYOffset;"));//3003
        //3)scroll down till end of the page/document
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));//9448
        Thread.sleep(5000);
        // go back to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

    }
}
