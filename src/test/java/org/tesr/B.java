package org.tesr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {
	
public static WebDriver driver;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		
		return driver;
	}
	
	
	public static void url(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
	public static void maxwindow() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	public static void sendkey(WebElement e1 , String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	public static void click(WebElement e2) {
		// TODO Auto-generated method stub
		e2.click();
	}
	
	public static void select1(WebElement e5, int i) {
		// TODO Auto-generated method stub
		Select s = new Select(e5);
		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		s.selectByVisibleText(text);
	}
	public static void keytab() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void keyenter() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void quitbower() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	public static String excelread(int r , int c ) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\\\Users\\\\DORABABU\\\\eclipse-workspace\\\\MyTestng\\\\Files\\\\data2.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(file);
		Sheet s = w.getSheet("data");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		String value ="";
		if (cellType ==1) {
		 value=cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = (Date) cell.getDateCellValue();
			java.text.SimpleDateFormat sim = new java.text.SimpleDateFormat("dd-MM-yyyy");
		}else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
		}
			return value;
		 }
	

}
