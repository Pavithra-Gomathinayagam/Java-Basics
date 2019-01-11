package com.zilker.javabasics;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Locale;
import java.text.*;

public class CurrencyFormat {
	private static Logger logger=Logger.getLogger(CurrencyFormat.class.getName());

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat lp;  //Local Payment

        lp = NumberFormat.getCurrencyInstance(Locale.US);
        logger.log(Level.INFO,"US: "+ lp.format(payment));
        
        lp = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        logger.log(Level.INFO,"German: " + lp.format(payment));
        
        lp = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        logger.log(Level.INFO,"German: " + lp.format(payment));

        lp = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        logger.log(Level.INFO,"France: " + lp.format(payment));
        
         lp = NumberFormat.getCurrencyInstance(Locale.ITALY);
        logger.log(Level.INFO,"Italy: " + lp.format(payment));
    }
}
