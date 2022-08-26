package java_data_types;

import java.util.Scanner;

public class Day08_task {

	public static void main(String[] args) {
		// this is the object of the scanner class
		// != means no equal
		Scanner monthInput = new Scanner(System.in);
		for(int a = 0; a < 3;a++) {
		System.out.println("Enter the month you were born in  :");
		String monthName = monthInput.next();
		if (monthName.equals("Jan") || monthName.equals("Feb") || monthName.equals("Mar")) {
			System.out.println("Winter");
		} else if (monthName.equals("Apr") || monthName.equals("May") || monthName.equals("Jun")) {
			System.out.println("Spring");
		} else if (monthName.equals("Jul") || monthName.equals("Aug") || monthName.equals("Sep")) {
			System.out.println("Summer");
		} else if (monthName.equals("Oct") || monthName.equals("Nov") || monthName.equals("Dic")) {
			System.out.println("Fall");
		}
	}
}
}