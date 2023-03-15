package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Element;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Signal;

public class UtilClass {
	public static WebDriver driver;
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();

	}
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
public static void maxi() {
	driver.manage().window().maximize();
}
public static void impWait(int second) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
}
public static void url(String url) {
	driver.get(url);
}
public static void searchBox(WebElement element,String value) {
element.sendKeys(value);	
}
public static void closeBtn(WebElement ref2) {
	ref2.click();
}
public static void login3(WebElement element3) {
	Actions a=new Actions(driver);
	a.moveToElement(element3).perform();
	
}
//public static void closeBtn1(WebElement ref1) {
	
//ref1.click();
//}
public static void mouseMove(WebElement element) {
	Actions a=new Actions(driver);
a.moveToElement(element).perform();
}
public static void clickBtn(WebElement ref3) {
	ref3.click();
}

public static void name(WebElement element1,String value) {
	element1.sendKeys(value);
}
public static void select(WebElement dubclick) {
	Actions a=new Actions(driver);
	a.doubleClick(dubclick).perform();
	
}
public static void alert1(WebElement alt) {
	alt.click();
	
}
public static void button(WebElement btn1) {
	btn1.click();
}
public static void alert2(WebElement alt1) {
	Alert a=driver.switchTo().alert();
	a.accept();
}
public static void alertOk(WebElement alt2) {
alt2.click();
}
public static void button1(WebElement btn2) {
	btn2.click();
}
public static void confirm(WebElement alt3) {
	Alert a=driver.switchTo().alert();
	a.accept();

}
public static void dismiss(WebElement can) {
	Alert a=driver.switchTo().alert();
	a.dismiss();
}
public static void textBox(WebElement btn3) {
	btn3.click();
}
public static void okBtn(WebElement alt4) {
	Alert a=driver.switchTo().alert();
	a.sendKeys("sasikala");
a.accept();
}
public static void text1(WebElement txt) {
	String text2=txt.getText();
	System.out.println(text2);
}
public static void attValue(WebElement att) {
String val=att.getAttribute("placeholder");
System.out.println(val);
}
public static void scrUp(WebElement i) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("arguments[0].scrollIntoView(true)", i);
}
public static void createAcc(WebElement crebtn) {
	crebtn.click();
}
public static void log1(WebElement in) {
	in.click();

}
public static void textPass(WebElement element,String value) {
	element.sendKeys(value);
}
public static void elementClick(WebElement element3) {
	
element3.click();
}
public static void gender1(WebElement gen) {
	gen.click();
}
public static void otp1(WebElement req) {
	
req.click();
}
public static void signIn1(WebElement clibtn) {
	clibtn.click();
}
public static String excelData(String sheetName,int rowNo,int cellNo) throws IOException {
	
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
}





