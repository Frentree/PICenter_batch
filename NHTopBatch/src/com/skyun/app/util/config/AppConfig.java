package com.skyun.app.util.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


public class AppConfig {

	private static String CONF_PATH = null;
	private static String PID = null;

	private static Properties props = new Properties();
	public static String currentDir = null;


	static {

		currentDir = System.getProperty("user.dir");
		File f = new File(currentDir);
		currentDir = f.getParent().toString();

		CONF_PATH = currentDir + "/conf/server.properties";
		
		System.out.println("Current Path:"+currentDir);
		System.out.println("CONF    Path:"+CONF_PATH);
		
		LocalePropertiesFromResource();

	}

	public AppConfig() {

	}
	
	//
	private static void LocalePropertiesFromResource() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(CONF_PATH);
			props.load(fis);
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getProperty(String key) {

		String value = props.getProperty(key);

		if (value == null) {
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
			return "";
		} else {
			value = value.trim();
			return value;
		}
	}

	public static String getPropertyDecode(String key) {
		String value = props.getProperty(key);
		if (value == null) {
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
			return "";
		} else {
			value = value.trim();
			return value;
		}
	}

	public static String getLocaleMesage(String key) {
		return props.getProperty(key).trim();
	}

	public static String getLocaleMesage(String key, String decode) {

		String str = "None";
		try {
			str = new String(props.getProperty(key).trim().toString().getBytes("iso-8859-1"), decode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
		}

		return str;
	}

	public static void setPID(String s) {
		PID = s;
	}

	public static String getPID() {
		return PID;
	}

	public static int getPropertyInt(String key) {
		String value = props.getProperty(key);

		if (value == null) {
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
			return 0;
		} else {
			value = value.trim();
			int a = Integer.parseInt(value);
			return a;
		}
	}

	public static Long getPropertyLong(String key) {
		String value = props.getProperty(key);

		if (value == null) {
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
			return 0L;
		} else {
			value = value.trim();
			return Long.parseLong(value);
		}
	}

	public static boolean getPropertyBoolean(String key) {
		String value = props.getProperty(key).toLowerCase();

		if (value == null) {
			System.out.println(String.format("getPropertyInt value not exit [%s] file Value [%s]", currentDir, key));
			return false;
		} else if (value.toLowerCase().equals("false")) {
			return false;
		} else {
			return true;
		}
	}

	public static void setProperty(String key, String value) {
		props.setProperty(key, value);
	}

}
