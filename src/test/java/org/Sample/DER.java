package org.Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.UtilClass;

public class DER extends UtilClass {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sasikala\\eclipse-workspace\\MavenProject\\ASD\\qw.xls");
		
		FileInputStream  fi= new FileInputStream(f);
		Workbook book = new HSSFWorkbook(fi);
		
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
	}

}
