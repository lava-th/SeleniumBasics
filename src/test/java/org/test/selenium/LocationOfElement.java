package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocationOfElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
       // System.out.println("before maximum the window"+logo.getLocation());//(234, 153)
        //driver.manage().window().maximize();
        //System.out.println("After maximize the window"+logo.getLocation());//(630, 174)
        //driver.manage().window().minimize();
       // System.out.println("After minimize the window"+logo.getLocation());//(234, 156)
        //driver.manage().window().fullscreen();
        //System.out.println("after fullscreen window"+logo.getLocation());//(630, 233)
        Point p=new Point(100,100);
        //driver.manage().window().setPosition(p);
        //System.out.println("after setting window 100*100"+logo.getLocation());//(234, 154)
        p=new Point(50,50);
        System.out.println("after setting window 50*50"+logo.getLocation());//(234, 161)

    }
}
