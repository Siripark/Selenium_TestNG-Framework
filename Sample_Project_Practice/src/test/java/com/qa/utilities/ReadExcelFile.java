package com.qa.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static FileInputStream inputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo)
	{
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			
			workbook.close();
			return cell.getStringCellValue();
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String fileName, String sheetName)
	{
		try {
			inputStream = new FileInputStream(fileName);
			
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			
			//get total no.of rows
			int ttlRows = excelSheet.getLastRowNum()+1;
			
			workbook.close();
			
			return ttlRows;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static int getColCount(String fileName,String sheetName)
	{
		try
		{
			inputStream= new FileInputStream(fileName);
			// create XSSFWork Class object for excel file manipulation
			workbook= new XSSFWorkbook(inputStream);
			excelSheet=workbook.getSheet(sheetName);
			
			//get total no. of column 
			int ttlCells= excelSheet.getRow(0).getLastCellNum();
			
			workbook.close();
			return ttlCells;
		}
		
		catch(Exception e)
		{
			return 0;
		}
	}
	public String getStringData(int sheetIndex, int row, int colum)
	{
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(colum).getStringCellValue();
	}
	public String getStringData(String sheetName, int row, int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public double getNumericData(String sheetName, int row, int column)
	{
		return workbook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
