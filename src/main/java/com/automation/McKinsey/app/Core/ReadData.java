package com.automation.McKinsey.app.Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static String[] ReadCSV(String testCaseId, String separator, String filename) {
    	//	log.info(" : ReadCSV Method Called");
    		BufferedReader br = null;
    		String[] values = null;
    		String line = "";

    		try {
    			File file = new File(System.getProperty("user.dir")+Config.readConfig("dataFileName"));
    			br = new BufferedReader(new FileReader(file));
    			while ((line = br.readLine()) != null) {
    				if (line.trim().startsWith(testCaseId.trim())) {
    					values = line.split(separator);
    					System.out.println(values);
    					break;
    				}
    			}
    		} catch (FileNotFoundException ex) {
    		//	log.error(ex.getMessage());
    			ex.printStackTrace();
    		} catch (IOException ex) {
    		//	log.error(ex.getMessage());
    			ex.printStackTrace();
    		} finally {
    			if (br != null) {
    				try {
    					br.close();
    				} catch (IOException ex) {
    					//log.error(ex.getMessage());
    					ex.printStackTrace();
    				}
    			}
    		}
    		return values;
    	}
	
}
