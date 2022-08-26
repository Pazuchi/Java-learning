package java_data_types;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Enter the first value : ");
		
		int a = getInput.nextInt();
		
		System.out.println("Enter the second value : ");
	
		int b = getInput.nextInt();
		
		System.out.println("enter the third value : ");
		int c = getInput.nextInt();
		
		int d = a+b+c;
		System.out.println("the sum is : "+d);
		
		

}


}
