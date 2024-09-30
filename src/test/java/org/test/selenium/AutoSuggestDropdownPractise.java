package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdownPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.nl/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='L2AGLb']/div")).click();
        //driver.findElement(By.tagName("ntp-app")).getShadowRoot().findElement(By.cssSelector("#realbox")).getShadowRoot().findElement(By.cssSelector("#input")).sendKeys("selenium");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");

        Thread.sleep(3000);
        //div[@id='Alh6id']//li
        List<WebElement> Elements=driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
        System.out.println("Number of suggestion:"+Elements.size());
        //*[@id="input"]
        //select an option from list
        for(int i=0;i< Elements.size();i++){
            String text=Elements.get(i).getText();
            if(text.equals("selenium kruidvat")){
                Elements.get(i).click();
                break;
            }
        }


    }
}
