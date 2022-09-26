package localizedExamples;

import java.text.NumberFormat;
import java.util.Locale;

public class I18NNumber {

	public static void main(String[] args) {

		printNumber(Locale.UK);
		

	}
	static void printNumber(Locale locale) {
		
		double number = 105000.1234;
		
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		
		String formatNumber = formatter.format(number);
		System.out.println(formatNumber + " " + locale);
				
				
	}
}
