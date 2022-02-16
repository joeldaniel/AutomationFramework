package com.joel.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.joel.FrameworkExceptions.FrameworkException;
import com.joel.enums.Configproperties;

public final class ReadPropertyFile {

	private ReadPropertyFile() {}
	
	private static Properties prop=new Properties();
	private static Map<String,String> ConfigMap=new HashMap<>();
	
	
	
	static {
		try(FileInputStream FIS=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties")) {
			prop.load(FIS);
			for(Object Key:prop.keySet()) {
				ConfigMap.put(String.valueOf(Key), String.valueOf(prop.get(Key)));
			}
			
		
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);//since it is static block, to not have to execution further; we use system.exit(0)
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
