package com.learning.Utilities;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.learning.constants.Constants;

public class ExcelUtilities {
	FileInputStream file;
	XSSFWorkbook Workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	public static String LocatorColumn1;
	public static String LocatorName;
	public static String LocatorValue;
	public static String ActionColumn1;
	public static String DataColumn1 ;
	public static int TotalRows ;
	public void readExcelFile(String Location) throws IOException {
		//File Location
			file= new FileInputStream(Location);
			Workbook=new XSSFWorkbook(file); 
			sheet= Workbook.getSheet(Constants.SHEET);
			TotalRows=sheet.getLastRowNum();

			
	}
	public void getLocatorActionDatafromExcel(int row, int LocatorColumn,int ActionColumn, int DataColumn) {
		
		/* cell=	sheet.getRow(row).getCell(LocatorColumn);
		 String Cellvalue=cell.getStringCellValue();
*/
		//System.out.println("Value "+Cellvalue);
		LocatorColumn1=sheet.getRow(row).getCell(LocatorColumn).toString().trim();
		System.out.println(LocatorColumn1);
		if(!LocatorColumn1.contains("NA")) {
			LocatorName=LocatorColumn1.split("=")[0].toString().trim();
			LocatorValue=LocatorColumn1.split("=")[1].toString().trim();
			}
		else {

			LocatorName="NA";
			LocatorValue="NA";
		}
		//System.out.println(LocatorName +" : "+ LocatorValue);
		ActionColumn1=sheet.getRow(row).getCell(ActionColumn).toString().trim();
		DataColumn1=sheet.getRow(row).getCell(DataColumn).toString().trim();
		System.out.println(LocatorName +" : "+ LocatorValue + " Keyword :"+ ActionColumn1+ " Data :"+DataColumn1);
}}
