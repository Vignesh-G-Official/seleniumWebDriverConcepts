package dataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class readingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\config.properties");
		
		//Loading properties file
		Properties propertiesfile=new Properties();
		propertiesfile.load(file);
		
		//Reading data from properties file
		String url=propertiesfile.getProperty("appurl");
		String email=propertiesfile.getProperty("email");
		String pwd=propertiesfile.getProperty("password");
		String orderid=propertiesfile.getProperty("orderid");
		String customerid=propertiesfile.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+orderid+" "+customerid);
		
		
		//Read all the keys from properties file
		
		//Method1
		//Set<String> keys=propertiesfile.stringPropertyNames();
		//System.out.println(keys);
		
		//Method2
		Set<Object> keys=propertiesfile.keySet();
		System.out.println(keys);
		
		
		//Read all the values from properties file
		Collection<Object> values=propertiesfile.values();
		System.out.println(values);
		
		file.close();
		

	}

}
