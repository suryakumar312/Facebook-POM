package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {
	
	@Test
	public static Properties readData() {
		
		Properties prop = new Properties();
		FileInputStream fileinput = null;
		try {
			 fileinput =  new FileInputStream("F:\\FaceBook_POM\\Fb config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load( fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	 public static String getBrowser() {
		 return  ReadPropertyFile.readData().getProperty("browser");
	 }
	 
	 public static String getUrl() {
		return ReadPropertyFile.readData().getProperty("url");
	 }
	 
	 public static String getUsername() {
		return ReadPropertyFile.readData().getProperty("username");
	 }




	
	 
	 public static String getPassword() {
		return ReadPropertyFile.readData().getProperty("password");
	 }

}
