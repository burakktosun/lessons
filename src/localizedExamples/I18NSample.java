package localizedExamples;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NSample {
	
	//greeting - Hello, Hallo, Bonjour
	
	//inquiry - How are you?, Wie gehst?, Commet alle-vous
	
	//farewell  - Goodbye, Tschüss, Au revoir

	public static void main(String[] args) {

		String language;
		String country;
		
		if(args.length != 2) {
			language = new String();
			country = new String();
		}
			else {
				language = new String(args[0]);
				country = new String(args[1]);
			}
		
		Locale currentLocale = new Locale(language, country);
		
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle_fr_FR", currentLocale);
		System.out.println(messages.getString("greetings"));
			
		}

	}


