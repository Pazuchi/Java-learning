package java_data_types;

public class Day02_AssignedValues {
	// default value
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;

	public static void main(String[] args) {
		// initializing a variable ,
		// the variable name is a and the value is 5
		int a = 5;
		// declared a variable b
		System.out.println(a);
		System.out.println(b);
		// initialize a char variable d
		char d = 'h';
		System.out.println(c);
		System.out.println(d);
		double f = 10.54962788521478548975;
		System.out.println(e);
		System.out.println(f);
		float h = 10.84545584714254485488f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "Hello";
		System.out.println(k);
		System.out.println(l);

		String first_name = "Jaime";
		String last_name = "flores";
		System.out.println(first_name + last_name);
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Jaime" + ' ' + "flores");

		String car = "new";
		String Shopping = "and";
		String store = "used";
		System.out.println(car + ' ' + Shopping + ' ' + store);

		System.out.println("**********************************");
		System.out.println("Arithmetic");
		System.out.println("**********************************");

		int value1 = 50;
		int value2 = 10;

		// Addittion
		System.out.println(value1 + value2);
		int sum = value1 + value2;
		System.out.println(sum);

		// Subtraction
		System.out.println(value1 - value2);
		int sub = value1 - value2;
		System.out.println(sub);

		// division
		System.out.println(value1 / value2);
		int div = value1 / value2;
		System.out.println(div);

		// multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);

		// mod
		System.out.println(value1 % value2);
		int mod = value1 % value2;
		System.out.println(mod);

		System.out.println("************************************");
		System.out.println("task");
		System.out.println("************************************");

		int z = 5;
		System.out.println(z);
		char n = 'm';
		System.out.println(n);
		double o = 6.2;
		System.out.println(o);

		int p = 5;
		double q = 6.2;
		System.out.println(p + q);

		float r = 3.9f;
		System.out.println(r * r);

		int length = 2;
		int width = 3;
		int area = length * width;
		System.out.println(area);

		System.out.println("**********************************");
		System.out.println("operators");
		System.out.println("**********************************");

		int aa = 500;
		int bb = 600;

		System.out.println(500 == 600);
		System.out.println(aa == bb);
		boolean cc = aa == bb;
		System.out.println(cc);

		System.out.println(aa != bb);
		boolean dd = aa != bb;
		System.out.println(dd);

		System.out.println(aa > bb);
		boolean ee = aa > bb;
		System.out.println(ee);
		
		System.out.println(200>=200);
		boolean ff = 200 >= 200;
		System.out.println(ff);
		
		System.out.println(100<200);
		boolean gg = 100<200;
		System.out.println(gg);
		
		System.out.println(200<=300);
		boolean hh = 200<=300;
		System.out.println(hh);
		
		System.out.println("**********************************");
		System.out.println("operators");
		System.out.println("**********************************");
		

	}

}
