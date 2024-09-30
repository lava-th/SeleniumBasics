package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        /*conditional commands--They are applicable for web element instant or web element variables and this commands always return true or false stored in a variable
        isDisplayed()--tO check the same image present in the web page are not
        isEnabled()----Behaviour of the element is your elements are enabled
        isSelected()----epically use it for radio buttons,checkboxes,dropdowns
         */
      //boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
        //System.out.println("display the status of logo: "+logo);
        WebElement male=driver.findElement(By.xpath("//input[@value='M']"));
        WebElement female=driver.findElement(By.xpath("//input[@value='F']"));
        //Before selection
        System.out.println("Before selection.......");
        System.out.println(male.isSelected());//false
        System.out.println(female.isSelected());//false
        //After selection of male radio button
        System.out.println("After selection of male radio button..........");
        male.click();
        System.out.println(male.isSelected());//true
        System.out.println(female.isSelected());//false




    }
}
