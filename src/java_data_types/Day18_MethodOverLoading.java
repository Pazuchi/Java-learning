package java_data_types;

public class Day18_MethodOverLoading {

	public static void main(String[] args) {

		addittion(10, 20);
		addittion(5, 4, 3);
		addittion(3,5.33f);
		addittion("Hello","World");
	}
// method overloading by changing the number of the parameters
	
	static void addittion(int a, int b) {
		System.out.println(a + b);
	}

	static void addittion(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	// mmethod overloading by changing the type of vriables
	static void addittion(int a, float b) {
		System.out.println(a+b);
	}
	static void addittion(String a, String b) {
		System.out.println(a+b);
	}
}
