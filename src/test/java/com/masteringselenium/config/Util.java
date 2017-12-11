package com.masteringselenium.config;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static void renameLoggerFile() {
		File logOld = new File("logs/temp.log");		  
	    File logNew = new File("logs/logger_" + getTime() + ".log");
	    System.out.println("timestampfile: " + logNew);
	    boolean bool = true;
	    bool = logOld.renameTo(logNew);
	    System.out.println("rename: " + bool);
	}
	
	public static String getTime(){
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date).toString();
	}
	
}
