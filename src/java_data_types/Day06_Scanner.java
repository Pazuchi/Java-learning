package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//how to create an object
		// classname = new classname();
		Scanner takeInput = new Scanner(System.in);
		/*System.out.println("enter the int value is : ");
		int val1 = takeInput.nextInt();
		System.out.println("The enterred value is : "+val1);
		
		//nextBoolean ( true/false)
		System.out.println("it is raining outside : ");
		boolean val2 = takeInput.nextBoolean(); //true or false
		System.out.println("if it is true it is raining, if it is false then its not raining :"+val2);
		
		//nextline(String)
		System.out.println("Enter you name : ");
		String name = takeInput.next();
		System.out.println("The name you enterred is : "+name);
		
		//nextByte
		System.out.println("enter your age : ");
		byte age = takeInput.nextByte();
		System.out.println("the number enterred is : "+age);
		
		//nextDouble
		System.out.println("enter the distance : ");
		double distance = takeInput.nextDouble();
		System.out.println("the distance is : "+distance);
		
		//nextfloat
		System.out.println("enter the value : ");
		float d = takeInput.nextFloat();
		System.out.println("the value enterred is : "+d);
		
		//nextlong
		System.out.println("enter the capacity : ");
		long capacity = takeInput.nextLong();
		System.out.println("the capacity is : "+capacity);
	*/	
		//nextshort
		System.out.println("enter junior salary");
		short salary = takeInput.nextShort();
		System.out.println("The salary enterred is : "+salary);
		
	int a = 10;
	int b = 20;
	
     String input = "+";
     if(input == "+") {
    	 System.out.println(a+b);
     }else if(input == "-") {
    	 System.out.println(a-b);
     }else if(input == "/") {
    	 System.out.println(a/b);
     }else if(input == "*") {
    	 System.out.println(a*b);
     }else {
    	 System.out.println("You have enterred an invalid operation");
     }
		
		
		
		
		
		
		

	}

}
