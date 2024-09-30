package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFrame {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //Frame 1
        WebElement frm1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frm1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("111111");
        driver.switchTo().defaultContent();

        //Frame3
        WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frm3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("3333");
        //inner frame
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("div#i5")).click();//select first radio button in frame
        driver.switchTo().defaultContent();
        //frame2
        WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frm2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("77777");
//frame4
        driver.switchTo().defaultContent();
        WebElement frm4= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frm4);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("44444");
        //frame5
        driver.switchTo().defaultContent();
        WebElement frm5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frm5);
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("88888");
        driver.findElement((By.linkText("https://a9t9.com"))).click();
        driver.switchTo().defaultContent();







    }
}
