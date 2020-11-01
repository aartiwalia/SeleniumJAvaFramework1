package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowcount=0;
	static int colcount=0;
	static String celldata=null;

	public ExcelUtils(String sheetPath,String sheetName) //constructor is created here to store path and sheetname
	{
		try {
			workbook=new XSSFWorkbook(sheetPath);//reference for workbook
			sheet=workbook.getSheet(sheetName);  //ref for worksheet
		} catch (IOException e) {

			e.printStackTrace();
		} 


	}
	public static void main(String[] args) throws IOException {
		//getRowCount();
		getCellData(0,0);
	}
	public static int getRowCount() throws IOException
	{
		rowcount=sheet.getPhysicalNumberOfRows(); //get rowcount
		System.out.println(rowcount);
		return rowcount;

	}
	public static int getColCount() throws IOException
	{
		colcount=sheet.getRow(0).getPhysicalNumberOfCells(); //get colcount
			System.out.println(colcount);
			return colcount;

	}

	public static String getCellData(int rowNum,int colNum) throws IOException //to avoid hardcoding we l use parameters in getCellData()
	{

		celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(celldata);
		return celldata;
	}
}
