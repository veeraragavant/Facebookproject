package com.facebook.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class BaseClass {

	public static WebDriver driver;

	public static void BrowserLaunch(String browser) {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Adactin\\src\\test\\resource\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) {

			System.setProperty("webdriver.edge.driver", "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		}


	}
	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void windowmax() {
		driver.manage().window().maximize();
	}

	public static void elementsend(WebElement element,String value) {
		element.sendKeys(value);
	}

	public static void elementclick(WebElement element) {
		element.click();
	}
	
	public static String Readxl(int r, int c) throws IOException {
		
		String path = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\src\\test\\java\\com\\Testdata\\Book2.xlsx";
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(r);
		Cell cell = row.getCell(c);
		
		CellType celltype = cell.getCellType();
		String s = null;
		
		if (celltype.equals(CellType.STRING)) {
			s= cell.getStringCellValue();
		} else if (celltype.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			long l = (long) ncv;
			s= String.valueOf(l);
		} 
		return s;
			}
	
	 public static Map<String, String> Read_property() throws IOException {
			
			Map<String, String> map = new HashMap<String, String>();
			
			String s = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\src\\test\\java\\com\\facebook\\Facebook\\Credentials.properties";
			
			FileReader fr = new FileReader(s);
			Properties pro = new Properties();
			pro.load(fr);
			
			Enumeration<Object> keys = pro.keys();
			
			while (keys.hasMoreElements()) {
				String k = (String) keys.nextElement();
				String v = pro.getProperty(k);
				
				map.put(k, v);
				
			}
			return map;
	
		
	}
	 
	 public static boolean elementisdisplayed(WebElement element) {
		 
		 boolean display = false;
		
		 try {
			display=element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 return display;
	 }
	 
}
	 

	


