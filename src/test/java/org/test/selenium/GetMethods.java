package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

//getMethods:it is available through driver instance
/*get(URL)--it returns void no value, launch the url on the current browser
* getTitle()---it returns string and to get the title of the current webpage
* getCurrentURL()--it will also return String of the URL
* getPageSource()----The entire page sources will be return like it will return Html of the current webpage.
* getWindowHandle()----it will return single browser window ID
* getWindowHandles()----it will capture multiple window id's and returns set<String>
By using browser window id we can switch to one web page to another web page
* The browser window id's are not unique everytime it generates new Id's
* Here the set collections index is not supported how can capture the specific id only through looping statement
*
* */
public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//here
        driver.manage().window().maximize();
        Thread.sleep(5000);
       /* System.out.println("title of the page: "+driver.getTitle());//OrangeHRM

String Current_url=driver.getCurrentUrl();
        System.out.println("Current url :"+Current_url);*/
       // System.out.println("Page source...........");
        //String ps=driver.getPageSource();
        //System.out.println(ps);
        System.out.println("------------------------------------------------");
        //some other tags is present are not want to check then first you have to capture the entire page source
        //by using contains you can check it
        //contains method is also available in driver instant and returns boolean value
       // System.out.println("tage is present in page source to verify:"+ps.contains("head"));

//String id=driver.getWindowHandle();
        //System.out.println("Capture the window id:"+id);//F93D8DDD3A9C5806D5823061C2E131F4
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> ids=driver.getWindowHandles();
for(String winid:ids){
    System.out.println(winid); //CDwindow-7D9BFEDC337E6FC4270B05930BD9439C
                              //CDwindow-EEC8262ECC9740EF5C32B586CA7958CF
}

    }
}
