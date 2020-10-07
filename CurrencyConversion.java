import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class CurrencyConversion {

	public static void main(String[] args) {
// Covert currency in US, India, China, france;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Payment to convert : ");
		double payment = sc.nextDouble();
		sc.close();
		
		Locale indiaLocal = new Locale("en","in");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(indiaLocal.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocal);
		NumberFormat china = NumberFormat.getCurrencyInstance(indiaLocal.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(indiaLocal.FRANCE);
		
		System.out.println("US : "+us.format(payment));
		System.out.println("India : "+india.format(payment));
		System.out.println("China : "+china.format(payment));
		System.out.println("France : "+france.format(payment));
		
		
				
				
	}

}
