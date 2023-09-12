package testComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	

	
	public void initilizeSetup() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream FIS=new FileInputStream("/Users/Gleac/Desktop/Framework/gleac.AutomationFramework/src/main/java/gleac/AutomationFramework/AbstractComponents/AbstractComponents.properties");
		prop.load(FIS);
		String Browsername=prop.getProperty("Broswer");
		
		
		if(Browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();		
			
			
		}
		
		
		
	}
	
	
	

}
