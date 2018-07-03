package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	public static Object[][] ReadExcelData(String fileName,int sheetIndex) throws Exception  
	 {
		File f = new File(fileName); 
		FileInputStream fis = new FileInputStream(f); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 
		XSSFSheet sheet = myWorkBook.getSheetAt(sheetIndex); 
		int totR = sheet.getLastRowNum();
		int totC = sheet.getRow(0).getLastCellNum();
		Object arr[][]= new Object[totR][totC];
		  	
		for(int i=0;i<totR;i++)
		{
			Map<Object, Object> data = new HashMap<>();
			for (int j=0;j<totC ;j++) 
			{
				data.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
				System.out.println(arr[i][j]);
			}
			arr[i][0]= data;
		}
		return arr;	
	}
}