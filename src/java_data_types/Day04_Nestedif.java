package java_data_types;


public class Day04_Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		//VP 200000 Sr/Jr, IT_PROG 120000, ANALYST 80000
		String title = "developer";
		String role = "junior";
		
		if(title == "VP") {
			System.out.println("Vice Presindent");
			if (role == "junior") {
				System.out.println("Salary is $200.000");
			}else if (role == "senior") {
				System.out.println("salary is $250.000");
			}else {
				System.out.println("the role does not exist");
			}
		}else if(title == "IT_PROG") {
			System.out.println("IT_PROG");
			if (role == "junior"){
				System.out.println("the salary is $120.000");
			}else if(role == "senior") {
				System.out.println("the salary is $170.000");
			}else {
				System.out.println("the role does not exist");
			}
		}else if(title == "ANALYST") {
			System.out.println("System Analyst");
			if (role == "junior"){
				System.out.println("the salary is $80.000");
			}else if(role == "senior") {
				System.out.println("the salary is $130.000");
			}else {
				System.out.println("the role does not exist");
			}
			
		}else {
			System.out.println("The role does not exist");
		}
	}
	}
