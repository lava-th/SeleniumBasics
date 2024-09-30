package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class TablePagenation {
    public static void main(String[] args) throws InterruptedException {
        //ChromeOptions opt=new ChromeOptions();
        //opt.addArguments("--incognito");
        WebDriver driver=new EdgeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();
        //Login
        WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
username.clear();
username.sendKeys("demo");
WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
password.clear();
password.sendKeys("demo");

driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();

if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
    driver.findElement(By.xpath("//button[@class='btn-close']")).click();
}
//Customers-->customers
        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();//Showing 1 to 10 of 17846 (1785 Pages)
       int total_pages=Integer.parseInt( text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
        System.out.println("Total number of pages"+total_pages);
        for(int p=1;p<=10;p++){
            if(total_pages>1)
            {
                WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));
                System.out.println("Active page:"+ active_page.getText());
                active_page.click();
                Thread.sleep(2000);
            }
            int noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            for(int r=1;r<noOfrows;r++) {
                String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[2]")).getText();
                String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[3]")).getText();
                String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[5]")).getText();

                System.out.println(customerName + "      " + customerEmail + "          " + status);
            }

        }
        driver.quit();

    }
}
