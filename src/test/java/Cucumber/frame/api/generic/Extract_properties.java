package Cucumber.frame.api.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Extract_properties 
{
	public static String extract_properties(String key) 
	{
		FileInputStream f1 = null;
		try {
			f1 = new FileInputStream("D:\\Selenium_tanush\\testyantra.com.API\\src\\test\\java\\api_hybrid_framwork\\utils\\globalproperties.properties");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Properties pro = new Properties();
		try {
			pro.load(f1);
		} catch (IOException e) 
		{	
			e.printStackTrace();
		}
		return pro.getProperty(key);
	}
}
