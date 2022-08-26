package java_data_types;

public class Day24_MoreStrings {

	private static char[] stringPresent;

	public static void main(String[] args) {
		
		String fname = "Jaime";
		String lname = "Flores";
		String fullname = fname.concat(lname);
		System.out.println(fullname);
		
		String day = "   Today we are learning Strings   ";
		day = day.trim();
		
		if(day.equals("Today we are learning Strings")) {
			System.out.println("Yayy, the string value matched.");
		}else {
			System.out.println("The value does not match");
		}
			//starswith
			String transaction = "$50.00";
			boolean dollarSymbol = transaction.startsWith("$");
			if(dollarSymbol) {
				System.out.println("The prefix is present");
			}else {
				System.out.println("It is not present");
			}
			System.out.println(day.startsWith("Today"));
			boolean stringPresent = day.endsWith("String");
			System.out.println(stringPresent);//true
			
			char ret = transaction.charAt(0);
			System.out.println(ret);
			
			System.out.println(transaction.indexOf('5'));
			String email = "Hello123@gmail.com";
			System.out.println(email.indexOf('@'));
			
			System.out.println(email.substring(8));
			System.out.println(email.substring(0,8));
			
			String title = "Welcome to the car dealer$hip";
			System.out.println(title);
			title = title.replace("$","s");
			System.out.println(title);
			
	

	}

}
