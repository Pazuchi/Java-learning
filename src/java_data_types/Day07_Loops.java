package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {
			System.out.println("have fun");
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		/*
		 * for(int i=20; i<=50;i=i+2) { System.out.println(i); }
		 */
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		/*
		 * for(int i=21; i <=50; i=i+2) { System.out.println(i); }
		 */

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		for (int i = 0; i <= 2; i++) {

		}
		Scanner Input = new Scanner(System.in);
		System.out.println("what month do u born :");
		String month = Input.next();
		
		
		if (month== "January") {
			System.out.println("You born on winter");
		}else if (month== "february") {
			System.out.println("summer");
		}else {
			System.out.println("try again");
		}
	}

}
