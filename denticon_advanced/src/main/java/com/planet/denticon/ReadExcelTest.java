package com.planet.denticon;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelTest {
	public Sheet readData(String filelocatio, String sheetName) throws Exception, IOException{	
	File file=new File(filelocatio);
	Workbook wb = Workbook.getWorkbook(file);
	Sheet sh = wb.getSheet(sheetName);
	return sh;
	
	}
}
