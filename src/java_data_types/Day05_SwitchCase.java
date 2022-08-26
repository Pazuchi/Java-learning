package java_data_types;

public class Day05_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "tuesday";

		switch (day) {

		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2nd day of the week");
			break;
		case "wensday":
			System.out.println("3rd day of the week");
			break;
		case "thursday":
			System.out.println("4th day of the week");
			break;
		case "friday":
			System.out.println("5th day of the week");
			break;
		case "saturday":
			System.out.println("6th day of the week");
			break;
		case "sunday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("you have enterred an invalid day.");
		}

		// start
		int age = 4;
		switch (age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		case 5:
			System.out.println("the value is 5");
			break;
		default:
			System.out.println("the value is something else");
		}
		// ends here

		char size = 'm';
		switch (size) {
		case 'd':
			System.out.println( "S");
			break;
		case 'e':
			System.out.println("M");
			break;
		case 'f':
			System.out.println("L");
			break;
		case 'm':
			System.out.println("XL");
			break;
		default:
			System.out.println("the size is variable");
		}
	}

}
