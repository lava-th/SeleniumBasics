package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickButton {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.findElement(By.id("accept-choices")).click();
        driver.switchTo().frame("iframeResult");//switch to frame
        WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
        f1.clear();
        f1.sendKeys("lava");
        WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        Actions act=new Actions(driver);
        act.doubleClick(button).perform();//double click action
        //validation
        WebElement F2=driver.findElement(By.xpath("//input[@id='field2']"));
        //String copiedtext=F2.getText();//will not work
        String copiedtext=F2.getAttribute("value");
        System.out.println("Copied text is:"+copiedtext);
        if(copiedtext.equals("lava")){
            System.out.println("test passed");

        }
        else{
            System.out.println("test failed");
            }


    }
}
