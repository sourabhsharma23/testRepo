package com.seleniumDemo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig() {
	
	File file = new File("./Configuration/config.properties");

		try {
		FileInputStream fisteam = new FileInputStream(file);
		prop = new Properties();
		prop.load(fisteam);	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

		public String getApplicationUrl(){
			String url = prop.getProperty("baseUrl");
			return url;
			}
		
		public String getUsername(){
			String username = prop.getProperty("username");
			return username;
			}
		
		public String getPassword(){
			String password = prop.getProperty("password");
			return password;
			}
	
}
