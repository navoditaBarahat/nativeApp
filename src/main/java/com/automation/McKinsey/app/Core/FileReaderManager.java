package com.automation.McKinsey.app.Core;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static Config configFileReader;
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public Config getConfigReader() {
		 return (configFileReader == null) ? new Config() : configFileReader;
	 }
}
