package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class ProeprtiesFile {
	static Properties prop=new Properties();
	static String path=System.getProperty("user.dir"); // to use relative path of the config file
	public static void main(String[] args) throws IOException {

		getProperties();
		setProperties();
	}
	public static void getProperties() throws IOException //function to read values from file
	{


		InputStream input=new FileInputStream(path +"\\src\\test\\java\\config\\config.properties"); //get path of the file
		prop.load(input); // load the file from path
		System.out.println(prop.getProperty("browser")); //read values from the file
		TestNG_Demo.browserName=prop.getProperty("browser");
	}

	public static void setProperties() throws IOException //func to write data to file
	{
		try {
			OutputStream output=new FileOutputStream(path +"\\src\\test\\java\\config\\config.properties");
            prop.setProperty("browser", "firefox"); //set the values
            prop.store(output, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
