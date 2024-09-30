package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//File---->Workbbook---->Sheets---->Rows----->Cells

public class ReadingTheExcel {
    public static void main(String[] args) throws IOException {
        //TO open the excelsheet file for reading purpose already have some data in excel sheet
        FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Lavanya\\Automation\\ProjectSelenium\\testdata\\data.xlsx");
        //It is go to excel workbook
        XSSFWorkbook workbook=new XSSFWorkbook(file);

        //It is go to the sheet
        XSSFSheet sheet=workbook.getSheet("Sheet1");//workbook.getSheetAt(0);

        //Number of rows in excel sheet
        int total_row=sheet.getLastRowNum();//returns number of rows in excel sheet

        //Number of columns in excel sheet
        int total_columns=sheet.getRow(1).getLastCellNum();//returns number of cells present in a row

        System.out.println("Number of rows:"+total_row);//5//As per excel sheet rows counting is starts from zero
        System.out.println("Number of columns:"+total_columns);//4//As per excel sheet columns counting is starts from one

        //How to read the data in the excel sheet in the console
        for(int r=0;r<total_row;r++)
        {
            XSSFRow currentRow=sheet.getRow(r);

            for(int c=0;c<total_columns;c++){
               /* XSSFCell column=currentRow.getCell(c);
                String value=column.toString();*/
                String value=currentRow.getCell(c).toString();//Reading the data from the cell
                System.out.println(value+"   ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();





    }
}
