package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public WebDriver browserlanch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		return driver;
		
	}
	public String exceldata(String sheetName,int rowNo,int cellNo) throws IOException {
		File f=new File("C:\\Users\\sasikala\\eclipse-workspace\\MavenProject\\screen1\\FameExcel.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fi);
		Sheet sheet=book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();
		String value="";
		if(type==1){
			
			value=cell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat("dd,MMMM,yyyy");
			value=s.format(d);
				
		}
		else {
			double d=cell.getNumericCellValue();
			long l=(long)d;
			value=String.valueOf(l);
		}
		return value;
		}
	
	public void closure() {
		driver.quit();
	}
	
	

}
