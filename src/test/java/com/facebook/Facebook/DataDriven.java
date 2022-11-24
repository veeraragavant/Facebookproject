package com.facebook.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

public static void Readxl(int r, int c) throws IOException {
		
		String path = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\src\\test\\java\\com\\Testdata\\Book1.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);

		//CellType celltype = cell.getCellType();
		//String s = null;

		//		if (celltype.equals(CellType.STRING)) {
		//			s= cell.getStringCellValue();
		//		} else if (celltype.equals(CellType.NUMERIC)) {
		//			double ncv = cell.getNumericCellValue();
		//			long l = (long) ncv;
		//			s= String.valueOf(l);
		//		} 
		//		return s;
			
			DataFormatter df = new DataFormatter();
			String formatCellValue = df.formatCellValue(cell);
			System.out.println(formatCellValue);
}

public static void Writexl(int r, int c, String value) throws Throwable {
	
	String path = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\src\\test\\java\\com\\Testdata\\Book1.xlsx";
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(r);
	Cell cell = row.getCell(c);
	
	if (row==null) {
     sheetAt.createRow(r);
     }

	if (cell==null) {
		row.createCell(c);
	}

	cell.setCellValue(value);
	FileOutputStream os = new FileOutputStream(f);
	wb.write(os);
	wb.close();

}

public static void main(String[] args) throws Throwable {
	
Readxl(0, 4);
	
}

}
	
		
	

	

