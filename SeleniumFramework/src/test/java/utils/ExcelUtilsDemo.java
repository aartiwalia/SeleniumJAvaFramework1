package utils;

import java.io.IOException;

public class ExcelUtilsDemo {

	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir");
		ExcelUtils util=new ExcelUtils(path + "\\excel.xlsx","Sheet1");
		util.getRowCount();
		util.getCellData(0, 0);

	}

}
