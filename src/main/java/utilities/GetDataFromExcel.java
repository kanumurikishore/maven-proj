package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
	FileInputStream fileinputstream;
	
	public double getValueFromExcel(int sheetIndex,int rowNum,int colNum)
	{
		XSSFWorkbook xssfworkbook=new XSSFWorkbook();
		XSSFSheet sheet=xssfworkbook.getSheetAt(sheetIndex);
		XSSFRow row=sheet.getRow(rowNum);
	XSSFCell col=	row.getCell(colNum);
	Double value=col.getNumericCellValue();
	try {
		 fileinputstream=new FileInputStream("C:\\Iswarya\\SampleMavenProj\\src\\main\\java\\com\\smp\\qa\\config\\configuration.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties properties=new Properties();
	try {
		properties.load(fileinputstream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return value;
	

		
	}
}

