package com.joel.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.joel.enums.Configproperties;

public final class ReadPropertyFile {

	private ReadPropertyFile() {}
	
	private static Properties prop=new Properties();
	private static Map<String,String> ConfigMap=new HashMap<>();
	
	
	
	static {
		try {
			FileInputStream FIS=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
			prop.load(FIS);
			for(Object Key:prop.keySet()) {
				ConfigMap.put(String.valueOf(Key), String.valueOf(prop.get(Key)));
			}
			
			//ConfigMap.entrySet().forEach(entryset->ConfigMap.put(String.valueOf()), String.valueOf(entryset.getValue())));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	/*public static String readProperty(String key) throws Exception {
		if(Objects.isNull(key)) 
			throw new Exception("key is not available");
	
		return ConfigMap.get(key);		
	}*/
	
	public static String get(Configproperties key)  {
		if (Objects.isNull(key) || Objects.isNull(ConfigMap.get(key.name().toLowerCase()))) {
			System.err.println("Property name " + key + " is not found. Please check config.properties");
		}
		return ConfigMap.get(key.name().toLowerCase());
	}
	
	
}
