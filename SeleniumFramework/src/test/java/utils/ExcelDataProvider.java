package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	//public static void main(String[] args) throws IOException {
	@Test(dataProvider="test1")	
	public void test1(String username, String password)
		{
			System.out.println(username +"|"+ password);
		}
@DataProvider(name="test1")
	public static Object[][] getData() throws IOException
	{
	String excelPath=System.getProperty("user.dir");
	Object data[][]=testData(excelPath + "\\excel.xlsx","Sheet1");
	return data;

	}
	public static Object[][] testData(String excelPath,String sheetName) throws IOException //function and objects to read our functions of execl file
	{
		String excelpath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(excelpath +"\\excel.xlsx", "Sheet1");
		int rowcount=excel.getRowCount();
		int colcount=excel.getColCount();
		Object data[][]=new Object[rowcount-1][colcount]; //as 1st one is header hence -1, this line puts data into an array
		for(int i=1;i <rowcount;i++)
		{
			for (int j=0;j<colcount;j++)
			{
				String celldata=excel.getCellData(i, j);
				System.out.println(celldata + "|");
				data [i-1][j]=celldata;
			}
			System.out.println();
		}
		return data;
	}
}
