package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// By generic reusable method i.e by not hardcoding it 
		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
		 	Workbook wb = WorkbookFactory.create(fis);
		 	Sheet sh = wb.getSheet(sheetName);
		 	Row row = sh.getRow(rowCount);
		 	 Cell cell = row.getCell(cellCount);
		 	String value = cell.getStringCellValue();
		 	return value;
		}
	 	
		
		

	          public String readPropertyFile(String propertyPath , String key) throws IOException
	          {
	        	 FileInputStream fis = new FileInputStream(propertyPath);
	        	Properties prop = new Properties();
	        	prop.load(fis);
	            String	value=prop.getProperty(key);
	            System.out.println(value);
	            return value;
	          }
	        
	        	
	        			
	       public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	       {
	    	   FileInputStream fis = new FileInputStream(excelPath);
	   	 	Workbook wb = WorkbookFactory.create(fis);
	   	 	Sheet sh = wb.getSheet(sheetName);
	   	 	Row row = sh.getRow(rowCount);
	   	 	 Cell cell = row.getCell(cellCount);
	   	 	 cell.setCellValue(data);
	   	 	 
	   	 	 FileOutputStream fos = new FileOutputStream(excelPath);
	   	 	 wb.write(fos);
	   	 	 wb.close();
	   	 	 
	       }
	       
	       
	       public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	       {
	    	   FileInputStream fis = new FileInputStream(excelPath);
	    	   Workbook wb = WorkbookFactory.create(fis);
	    	   Sheet sh = wb.getSheet(sheetName);
	    	   int rc = sh.getLastRowNum();
	    	   return rc ;
	       }
}



