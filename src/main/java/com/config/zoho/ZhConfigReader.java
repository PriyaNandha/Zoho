package com.config.zoho;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ZhConfigReader {
	
private Properties p;
	
	public ZhConfigReader () throws IOException {
		
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Zoho\\src\\main\\java\\com\\config\\zoho\\Zoho.properties");
		
		FileInputStream fi = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fi);
		
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getMovetoElement() {
		String movetoelement = p.getProperty("targetelement");
		return movetoelement;
	}

	public String getEmailid() {
		String emailid = p.getProperty("emailid");
		return emailid;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	

}
