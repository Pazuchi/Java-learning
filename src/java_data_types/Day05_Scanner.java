package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object / instance of the class
		
		//classname objectname = new classname();
		Scanner getInput = new Scanner(System.in);
		//getInput in the object of the Scanner class.
		
		System.out.println("Enter the first value : ");
		//scanner class has methods which takes the int value as input
		int aa = getInput.nextInt();
		
		System.out.println("enter the second value : ");
		int bb = getInput.nextInt();
		
		System.out.println("enter the third value : ");
		int dd = getInput.nextInt();
		
		int cc = aa+bb+dd;
		System.out.println("the sum is : "+cc);
		
	}

}
