package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingExcelSheet {
    public static void main(String[] args) throws IOException {
        //File---->Workbook---->sheet----->row---->cell
        FileOutputStream file=new FileOutputStream("C:\\Users\\DELL\\Lavanya\\Automation\\ProjectSelenium\\testdata\\myfile_two.xlsx");
        //workbook is created
        XSSFWorkbook workbook=new XSSFWorkbook();
        //Creating the sheet
        XSSFSheet sheet=workbook.createSheet("Sheet1");


        //Crating the rows,cells and update data without loop
        /*XSSFRow rows=sheet.createRow(0);

        rows.createCell(0).setCellValue("Welcome");
        rows.createCell(1).setCellValue("12345");
        rows.createCell(2).setCellValue("xyz");

        XSSFRow row2=sheet.createRow(1);

        row2.createCell(0).setCellValue("abc");
        row2.createCell(1).setCellValue("4567");
        row2.createCell(2).setCellValue("testing");*/

        //Creating the rows,cells and update data with loop
        Scanner sc=new Scanner(System.in);
        for(int r=0;r<=3;r++){
            XSSFRow currentrow=sheet.createRow(r);
            for(int c=0;c<2;c++)
            {
                //current.createCell(c).setCellValue("welcome");
                System.out.println("Enter a vlaue");
                String value=sc.next();
                currentrow.createCell(c).setCellValue(value);
            }
        }


        workbook.write(file);//for writing the data from the excel sheet should attach the file to the workbook
        workbook.close();
        file.close();

        System.out.println("Writing is done!!!!");


    }
}
