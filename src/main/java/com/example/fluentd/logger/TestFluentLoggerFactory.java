package com.example.fluentd.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.fluentd.logger.FluentLogger;
import org.fluentd.logger.FluentLoggerFactory;

public class TestFluentLoggerFactory {
	
	private static FluentLoggerFactory loggerFactory = new FluentLoggerFactory();

	
	public static void main(String[] args) {
		System.out.println(new java.util.Date());
		FluentLogger LOGGER = loggerFactory.getLogger("app", "localhost", 24224);
		
		try {
			Map<String, Object> data_info = new HashMap<String, Object>();
			//data_info.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info.put("info", "This is info");
			LOGGER.log("info", data_info);
			
			Map<String, Object> data_trace = new HashMap<String, Object>();
			//data_trace.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_trace.put("trace", "This is trace");
			LOGGER.log("trace", data_trace);
			
			Map<String, Object> data_debug = new HashMap<String, Object>();
			//data_debug.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_debug.put("debug", "This is debug");
			LOGGER.log("debug", data_debug);
			
			Map<String, Object> data_warning = new HashMap<String, Object>();
			//data_warning.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_warning.put("warning", "This is warning");
			LOGGER.log("warning", data_warning);
			
			try {
				Integer.parseInt("sdsdsdd");
			} catch (Exception ex) {
				Map<String, Object> data_error = new HashMap<String, Object>();
				//data_error.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
				data_error.put("error", "This is error");
				LOGGER.log("error", data_error);
			}						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
