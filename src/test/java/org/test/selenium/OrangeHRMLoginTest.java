package org.test.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {
    /*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button
6) Verify the title of dashboard page
	Exp title : OrangeHRM
7) close browser

 */
    public static  void main(String[] args) throws InterruptedException {
        // System.out.println("my first project");
        //Launch the browser
        WebDriver driver=new ChromeDriver();
        //open url
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();//chain methods//to maximize the chrome
        Thread.sleep(6000);
        //Provide Username -Admin
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(5000);
        //provide the password admin123
        driver.findElement(By.name("password")).sendKeys("admin123");
        //name="password"

        //copy full xpath // /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input
//copy xpath//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input
        Thread.sleep(5000);
        //click on login button
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        ////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
        Thread.sleep(5000);
        //verify the title of the dashboard page
        //Title validation---In these scenario it is taking both after and before login title of the dashboard as per requirment it should take only after login success should match the title
        /*String act_title=driver.getTitle();
        String exp_title="OrangeHRM";
        if(act_title.equals(exp_title)){
            System.out.println("test passed");
        }
        else{
            System.out.println("failed");
        }*/
        //Label validation after successful login
        String act_label=" ";
        try{
             act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span")).getText();


        }
        catch (NoSuchElementException e) {

        }
            String exp_label="Dashboard";

            if(act_label.equals(exp_label)){
                System.out.println("test passed");
            }
            else{
                System.out.println("test failed");
            }






        //driver.close();
        driver.quit();




    }
}
