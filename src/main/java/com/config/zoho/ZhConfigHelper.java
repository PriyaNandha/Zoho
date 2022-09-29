package com.config.zoho;

import java.io.IOException;


public class ZhConfigHelper {
	
	private ZhConfigHelper() {
		
	}
	
	public static ZhConfigReader getInstance() throws IOException {
		
		ZhConfigReader amzreader = new ZhConfigReader();
		
		return amzreader;
		
	}
	

}
