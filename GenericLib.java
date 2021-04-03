//package com.activetime.Testcases;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
///**
// * 
// * 
// * @author Ishita
// * created on 12th May 2015
// */
//public class GenericLib {
//	
//	static String filepath="./config.Properties";
//	Properties prop;
//	/**
//	 * @description: read value from properties files based on key
//	 * @param key
//	 * @return
//	 */
//	public static String getValue(String key) {
//		
//		String value=null;
//	
//		try {
//			Properties prop = new Properties();
//			prop.load(new FileInputStream(new File(filepath)));
//			
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
//		
//		return value;
//		
//		
//	}
//	public String getApplicationUrl()
//	{
//		String url=prop.getProperty("baseUrl");
//		
//		return url;
//	}
//	public String getchromepath()
//	{
//		String chromepath=prop.getProperty("chromepath");
//		return chromepath;
//	}
//	public String getUsername()
//	{
//		String Username=prop.getProperty("Username");
//		return Username;
//	}
//	public String getPassword()
//	{
//		String Password=prop.getProperty("Password");
//		return Password;
//	}
//	
//	
//	public String getfirefox()
//	{
//		String firefox=prop.getProperty("firefox");
//		return firefox;
//	}
//	public String getie()
//	{
//		String ie=prop.getProperty("ie");
//		return ie;
//	}
//}
//
//
//
//
