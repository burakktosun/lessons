package localizedExamples;

import java.util.Locale;

public class LocaledLesson {

	public static void main(String[] args) {

		Locale locale = new Locale("en", "EN");
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());

		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());


	}

}
