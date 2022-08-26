package java_data_types;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		String words = "#@$^&32&%57$8&(9V7F5ITC%##@";
		String noNumbers = words.replaceAll("[0-9]","");
	System.out.println("Before removing[0-9]numbers ; "+words);
	System.out.println("After removing[0-9] numbers ; "+noNumbers);
	}

}
