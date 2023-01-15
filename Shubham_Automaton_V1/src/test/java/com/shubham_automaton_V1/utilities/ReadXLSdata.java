package com.shubham_automaton_V1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ReadXLSdata readXLSdata = new ReadXLSdata();
		readXLSdata.getData("pass the sheet name");

	}

	//from which file we want to read data
	public String[][] getData(String excelSheetname) throws EncryptedDocumentException, IOException  {
		//from which file we want to read data using file class
		//first we create  the file instance to read the file 
		File file = new File(System.getProperty("C:\\Users\\shubham.malode\\eclipse-workspace\\Shubham_Automaton_V1\\test-data")+"\\testdata.xlsx");
		//Secondly we create the input stream which create the stream of this file
		FileInputStream fis = new FileInputStream(file);
		//Thridly we want to go to workbook so In excel sheet we have the workbook and in work book we have the sheet
		Workbook wb = WorkbookFactory.create(fis);
		
		//now will read data from sheet, read the data from rows and column
		Sheet sheetname = wb.getSheet(excelSheetname);
		int totalRows = sheetname.getLastRowNum();
		System.out.println("total number of row count is: "+totalRows);
		
		//we need to get the column count so for that we can get cell
		Row rowcells = sheetname.getRow(0);
		int totalColumn = rowcells.getLastCellNum();
		System.out.println("total number of column count is: "+totalColumn);
		
		//we need to format the data
		DataFormatter format = new DataFormatter();
		
		String testData[][] = new String [totalRows][totalColumn];
		//now iterate through the sheet and read the data
		//first loop iterate through the Row's and second will iterate through column
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<=totalColumn;j++) {
				//create an 2D array to get the data
				testData[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		return testData;
	}
}
