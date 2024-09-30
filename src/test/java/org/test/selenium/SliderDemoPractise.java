package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemoPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']//p[@class='fc-button-label']")).click();

        Actions act=new Actions(driver);
        //Min slider
       WebElement min_silder= driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println("current location of minslider:"+min_silder.getLocation());//(59, 251)
        //draging the slider into a side
//        act.dragAndDropBy(min_silder,55,200).perform();
//        System.out.println("location on min slider after moving:"+min_silder.getLocation());//(115, 251)
        //max_slider
        WebElement max_slider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        System.out.println("current location of maximum slider:"+max_slider.getLocation());
        act.dragAndDropBy(max_slider, -96, 250).perform();
        System.out.println("Location of max slider after moving:"+max_slider.getLocation());

    }
}
