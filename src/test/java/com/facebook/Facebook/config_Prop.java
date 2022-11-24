package com.facebook.Facebook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class config_Prop {

	 public static Map<String, String> Read_property() throws IOException {
		
		Map<String, String> map = new HashMap<String, String>();
		
		String s = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\src\\test\\java\\com\\facebook\\Facebook\\Credentials.properties";
		
		FileReader fr = new FileReader(s);
		Properties pro = new Properties();
		pro.load(fr);
		
		Enumeration<Object> keys = pro.keys();
		
		while (keys.hasMoreElements()) {
			String k = (String) keys.nextElement();
			String v = pro.getProperty(k);
			
			map.put(k, v);
			
		}
		return map;
	}
	 public static void main(String[] args) throws IOException {
		
		 System.out.println(Read_property().get("Username"));
		 
	}
	 
}
