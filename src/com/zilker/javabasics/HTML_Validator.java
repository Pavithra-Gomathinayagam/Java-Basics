package com.zilker.javabasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HTML_Validator {
	private static Pattern pattern;
	private static Matcher matcher;
	private static Logger logger=Logger.getLogger(HTML_Validator.class.getName());
	//private static final String HtmlPattern = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
	private static final String HtmlPattern = "<.*?>([^<]+)</.*?>";
       	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();

		while(testCases-->0) {
			String input = scanner.nextLine();
			boolean valid = validate(input);
			if(valid==true)
				logger.log(Level.INFO,"Valid tag");
			else
				logger.log(Level.INFO,"Invalid tag");
			scanner.close();
		}
	}

	public static boolean validate(String input) {
		pattern = Pattern.compile(HtmlPattern);
		matcher = pattern.matcher(input);
	  	return matcher.matches();
	}

}
