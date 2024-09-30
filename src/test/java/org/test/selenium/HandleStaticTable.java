package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleStaticTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //1)Find total number of rows
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//7 rows with header row
        System.out.println("number of rows:"+rows);
        int rows1=driver.findElements(By.tagName("tr")).size();
        System.out.println("prefered only if you have one single table in the web page:"+rows1);

        //2)Find total number of columns
        int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("number of col:"+col);

        //3)Read specific row and column data
        String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
        System.out.println("print the value in the table:"+value);

        //Read the data from the rows and columns
        System.out.println("Book Name"+"    "+"Author"+"    "+"Subject"+"   "+"Price");
        for(int r=2;r<=rows;r++)
        {

            for(int c=1;c<=col;c++)
            {

                String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value1+"\t");


            }
            System.out.println();
        }

        //5)Print book name whose author is Amit
        for(int r=2;r<=rows;r++){
            String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(author.equals("Amit")){
                String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
                System.out.println(author+"    "+bookname);
            }
        }

//6)Find sum of prices for all the books
        int sum=0;
        for(int r=2;r<=rows;r++){
            String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
            sum=sum+Integer.parseInt(price);
        }
        System.out.println("Total price of books:"+sum);

    }
}
