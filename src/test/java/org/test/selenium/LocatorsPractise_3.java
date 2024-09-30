package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsPractise_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //open app
        driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjgh9vy9vqDAxWkQEECHYgZArMYABAAGgJ3cw&ase=2&gclid=CjwKCAiAzc2tBhA6EiwArv-i6dpD4ui_-egFr98MVzXe5Pug3qz7JJP9RUbWqz_qtH-thlyRCO_v-hoCSaoQAvD_BwE&ohost=www.google.com&cid=CAESVeD2_k5TROxgyuF42z8WfUpfHEZxsMZLZcyqm6NwP3X3o5uUIvWNuY3y2C4_sIJLpnLb_FRAG0jliCu2F9aj4_Hmj387xZQlH3h6OrFqcNF1r6zV7yE&sig=AOD64_3w3o7ddUOYGIkcY3Gq6VqzVw3UYw&q&nis=4&adurl&ved=2ahUKEwiXiNXy9vqDAxXv6wIHHaD3BtQQ0Qx6BAgFEAE");
        driver.manage().window().maximize();
        //find numbers of slider on home page
List<WebElement> sliders =  driver.findElements(By.xpath("//ol[@role='list']/li//img"));
        System.out.println("Number of sliders: "+sliders.size());
//i[@class='a-icon a-icon-next-rounded']
        Thread.sleep(5000);
        //find the total number of images in the home page
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Number of images:"+images.size());
        Thread.sleep(5000);
        //find the total number of links are there in the home page
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Number of links:"+links.size());


    }
}
