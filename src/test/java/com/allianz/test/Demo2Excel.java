package com.allianz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2Excel {
	
	public static void main (String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("src/test/resources/test_data/hrm_data.xlsx");
		
		XSSFWorkbook book =new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("invalidLoginTest");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object [][] data= new Object [rowCount-1][cellCount];
		
		DataFormatter format=new DataFormatter();
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
		//String value= sheet.getRow(i).getCell(j).getStringCellValue();
			
				data[i - 1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
		}
		
	}
		System.out.println(data);
		//write a logic to print all cell values
		
		
		book.close();
		file.close();
		
	
	
	}
	

}
