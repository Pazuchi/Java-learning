package java_data_types;


class Phone1 {
	String  make = "Apple";
	String color = "Black";
	void Hello() {
		System.out.println("This method is in parent class");
	}
}
class smartPhone extends Phone1 {
	String make = "Samsung";
	String color = "Yellow";
	void Hello() {
		System.out.println("This method is in child class");
	}
	void displayChildMake() {
		super.Hello();
		System.out.println("The phone is "+make);
		System.out.println("The color is "+color);
	}
	void displayParentsMembers() {
		System.out.println("This will print parent memebers : "+super.make);
		System.out.println("This will print the color "+super.color);
	}
}
public class Day19_Super {

	public static void main(String[] args) {
		smartPhone a = new smartPhone();
		a.displayChildMake();
		a.displayParentsMembers();
	}

}
