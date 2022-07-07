package com.properties;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager(){
		
		
	}
	
	public static FileReaderManager getInstanceFMR() {
		
		FileReaderManager fmr = new FileReaderManager();
		
		return fmr;
	}
	
	public ConfigurationReader getInstanceCR() throws IOException {
		
		ConfigurationReader cr = new ConfigurationReader();
		
		return cr;
		
	}

}
