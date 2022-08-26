package java_data_types;

import java.util.Scanner;

public class Day06_Scannertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner takeInput = new Scanner(System.in);
	System.out.println("enter the first value");
	int aa = takeInput.nextInt();
	System.out.println("enter the second value");
	int bb = takeInput.nextInt();
	System.out.println("Select the operation + - * /");
	char op = takeInput.next().charAt(0);
	
     
     if(op == '+') {
    	 System.out.println(aa+bb);
     }else if(op == '-') {
    	 System.out.println(aa-bb);
     }else if(op == '/') {
    	 System.out.println(aa/bb);
     }else if(op == '*') {
    	 System.out.println(aa*bb);
     }else {
    	 System.out.println("You have enterred an invalid operation");
     }
	}

}
