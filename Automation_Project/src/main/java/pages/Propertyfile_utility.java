package pages;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile_utility extends Baselibrary_utility{
	
	static String path= "C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Automation_Project\\\\Propertyfile\\\\Propertyfile_utiity.properties";
	public static String getproperties(String key){
		String value="";
		try {
		
		
		FileInputStream fis=new FileInputStream(path);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		value=prop.getProperty(key);
		}
		catch(Exception e)
		{
			System.out.println("Issue inn getproperties"+ e);
		}
		return value;
		
		
		
		
	}
	}

