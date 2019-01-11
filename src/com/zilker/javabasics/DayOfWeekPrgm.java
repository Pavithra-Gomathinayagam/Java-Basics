package com.zilker.javabasics;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.DayOfWeek;
public class DayOfWeekPrgm {
	private static Logger logger=Logger.getLogger(DayOfWeekPrgm.class.getName()); 
	static int dayofweekfunc(int d, int m, int y) 
	{ 
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	} 
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
	    int dow = dayofweekfunc(day, month, year); 
	    DayOfWeek dayofweek = DayOfWeek.of(dow);  
	    logger.log(Level.INFO,dayofweek.name());
	    sc.close();
	    
	} 

}
