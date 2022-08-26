package java_data_types;

public class Day03_ifCondition {

	public static void main(String[] args) {
		// true Statement
		if (2 == 2) {
			System.out.println("the value is 2");
		}
		System.out.println("After the statement");

		// false Statement
		if (2 == 3) {
			System.out.println("the value is not 2");
		}

		int a = 31;
		if (a == 30) {
			System.out.println("the value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
		}
		double b = 15.12345678912345;
		double c = 10.12345678912345;
		if (b == c) {
			System.out.println("both double values are same");
		} else {
			System.out.println("both double values are not the same");
		}

		int d = 5;
		if (d > 0) {
			System.out.println("the value is positive");
		} else {
			System.out.println("the value is negative");
		}

		char value = 'e';
		if (value == 'a') {
			System.out.println("the value is a");
		} else if (value == 'b') {
			System.out.println("the value is b");
		} else if (value == 'c') {
			System.out.println("the value is c");
		} else if (value == 'd') {
			System.out.println("the value is d");
		} else {
			System.out.println("the value is something else");
		}
		System.out.println("**********************");
		System.out.println("***Task***");
		System.out.println("**************");

		String day = "monday";
		if (day == "monday") {
			System.out.println("the day is monday");
		} else if (day == "tuesday") {
			System.out.println("the day is tuesday");
		}else if (day == "wendsday") {
			System.out.println("the day is wendsday");
		} else if (day == "thursday") {
			System.out.println("the day is thursday");
		} else if (day == "friday") {
			System.out.println("the day is friday");
		} else if (day == "saturday") {
			System.out.println("the day is saturday");
		} else if (day == "sunday") {
			System.out.println("the day is sunday");
		} else {
			System.out.println("the day is any day");
		}

		int day2 = 2;
		if (day2 == 1) {
			System.out.println("the day is monday");
		} else if (day2 == 2) {
			System.out.println("the day is tuesday");
		}else if (day2 == 3) {
			System.out.println("the day is wendsday");
		} else if (day2 == 4) {
			System.out.println("the day is thursday");
		} else if (day2 == 5) {
			System.out.println("the day is friday");
		} else if (day2 == 6) {
			System.out.println("the day is saturday");
		} else if (day2 == 7) {
			System.out.println("the day is sunday");
		} else {
			System.out.println("the day is any day");
		}

		
		boolean israining = true;
		
		if(israining == true) {
			System.out.println("it is raining");
		}else {
			System.out.println("it is not raining");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}