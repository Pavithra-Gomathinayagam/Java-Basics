package com.zilker.javabasics;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	
	private static Logger logger=Logger.getLogger(DateFormat.class.getName());
	public static void main(String args[])
	{
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy.MM.dd");
	    DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss a");
	    LocalDateTime now = LocalDateTime.now();  
	   
	    Date dat = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("E");
	    logger.log(Level.INFO,format.format(dat)+ " " + df.format(now)+" at "+ tf.format(now) +" UTC ");
	 
	}  
}   


