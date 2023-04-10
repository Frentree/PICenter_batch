package com.iopts.main;

import java.io.File;

public class BatchMain {
	public static String currentDir = null;
	private static String LOGJ_PATH = null;
	
	public static void main(String[] args) {
		
		currentDir = System.getProperty("user.dir");
		File f = new File(currentDir);
		currentDir = f.getParent().toString();
		
		LOGJ_PATH = currentDir + "/conf/logbackMail.xml";
		System.setProperty("logback.configurationFile", LOGJ_PATH);

		Thread th = new Thread(new DaemonThread());
		th.start();
	}

}
