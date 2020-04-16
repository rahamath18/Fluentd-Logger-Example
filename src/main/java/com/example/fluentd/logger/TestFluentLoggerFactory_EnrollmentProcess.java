package com.example.fluentd.logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.fluentd.logger.FluentLogger;
import org.fluentd.logger.FluentLoggerFactory;

public class TestFluentLoggerFactory_EnrollmentProcess {
	
	private static FluentLoggerFactory loggerFactory = new FluentLoggerFactory();

	
	public static void main(String[] args) {
		System.out.println(new java.util.Date());
		FluentLogger LOGGER = loggerFactory.getLogger("app", "localhost", 24224);
		
		try {
			long txnId = new Random().ints(6).count();
			
			Map<String, Object> data_info_1 = new HashMap<String, Object>();
			//data_info_1.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_1.put("info", "Enrollment started");
			data_info_1.put("txnId", txnId);		
			LOGGER.log("info", data_info_1);
			
			Map<String, Object> data_info_2 = new HashMap<String, Object>();
			//data_info_2.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_2.put("info", "Enrollment in-progress");
			data_info_2.put("txnId", txnId);			
			LOGGER.log("info", data_info_2);
			
			Map<String, Object> data_info_3 = new HashMap<String, Object>();
			//data_info_3.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_3.put("info", "Face capture verified");
			data_info_3.put("txnId", txnId);			
			LOGGER.log("info", data_info_3);
			
			Map<String, Object> data_info_4 = new HashMap<String, Object>();
			//data_info_4.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_4.put("info", "User created in AD");
			data_info_4.put("txnId", txnId);			
			LOGGER.log("info", data_info_4);
			
			Map<String, Object> data_info_5 = new HashMap<String, Object>();
			//data_info_5.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_5.put("info", "User created in Identity");
			data_info_5.put("txnId", txnId);			
			LOGGER.log("info", data_info_5);
			
			Map<String, Object> data_info_6 = new HashMap<String, Object>();
			//data_info_6.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_6.put("info", "OTP generated");
			data_info_6.put("txnId", txnId);			
			LOGGER.log("info", data_info_6);
			
			Map<String, Object> data_info_7 = new HashMap<String, Object>();
			//data_info_7.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_7.put("info", "OTP verified");
			data_info_7.put("txnId", txnId);			
			LOGGER.log("info", data_info_7);
			
			Map<String, Object> data_info_8 = new HashMap<String, Object>();
			//data_info_8.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS Z").format(new Date()));
			data_info_8.put("info", "Enrollment completed");
			data_info_8.put("txnId", txnId);			
			LOGGER.log("info", data_info_8);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
