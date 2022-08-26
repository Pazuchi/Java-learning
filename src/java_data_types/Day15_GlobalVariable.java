package java_data_types;

public class Day15_GlobalVariable {

	// Global variable
	String phone = "Iphone";
	String color = "black";
	static int memory = 32; //static variable

	public static void main(String[] args) {

		Day15_GlobalVariable johnPhone = new Day15_GlobalVariable();
		System.out.println(johnPhone.phone);
		System.out.println(johnPhone.color);
		System.out.println(johnPhone.memory);

		Day15_GlobalVariable stevePhone = new Day15_GlobalVariable();
		stevePhone.phone = "Iphone13";
		stevePhone.color = "Red";
		stevePhone.phone = "Iphone14";
		stevePhone.memory = 64;
		System.out.println(stevePhone.phone);
		System.out.println(stevePhone.color);
		System.out.println(stevePhone.memory);
		
		System.out.println("********Mike Phone*********");
		Day15_GlobalVariable MikePhone = new Day15_GlobalVariable();
		System.out.println(MikePhone.phone);
		System.out.println(MikePhone.color);
		System.out.println(MikePhone.memory);
		

		Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
		vinPhone.possible();
	}

	public static void possible() {
		Day15_GlobalVariable vinPhone = new Day15_GlobalVariable();
		vinPhone.phone = "Iphone12";
		vinPhone.color = "Grey";
		System.out.println(vinPhone.phone); // iphone
		System.out.println(vinPhone.color); // black
		System.out.println(vinPhone.memory);
	}
}
