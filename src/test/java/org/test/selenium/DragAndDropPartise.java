package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropPartise {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        //Mouse actions to drag and drop
        Actions act=new Actions(driver);
        //Rome-->italy
        WebElement rome_drag=driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement italy_drop=driver.findElement(By.xpath("//div[@id='box106']"));
        act.dragAndDrop(rome_drag,italy_drop).perform();//drag and drop
        //washington---->usa
        WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
        act.dragAndDrop(washington,usa).perform();

    }
}
