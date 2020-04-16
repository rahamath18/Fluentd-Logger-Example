package com.example.fluentd.logger;

import java.util.HashMap;
import java.util.Map;

import org.fluentd.logger.FluentLogger;

public class TestFluentLogger {
	
	private static FluentLogger LOGGER = FluentLogger.getLogger("app_name", "localhost", 24224);

	
	public static void main(String[] args) {
		
		try {
			//FluentLogger LOGGER = FluentLogger.getLogger("debug", "localhost", 24224);
	        LOGGER.isConnected();
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("name", "Rahamath S");
			data.put("city", "ABCD");	
			LOGGER.log("test", data);
			LOGGER.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
