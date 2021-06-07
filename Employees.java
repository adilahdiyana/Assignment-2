package Assignment2;

import java.util.Scanner; //user input
import java.text.DecimalFormat;

	public class Employees { //class of Employees
		
		Scanner input = new Scanner(System.in); //user to enter the input
		DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
	
		//declaring variables for data fields
		protected String employeeName;
		protected int age, phoneNumber, selection, choose, quantity;
		protected char gender;
		protected double salary, epf, totalPayment;
	
		public Employees() { //constructor with no arguments
			
			printInfo(); //2.2 Polymorphism
			
			System.out.println("INFORMATION OF EMPLOYEE");
			System.out.println("=========================");
			
			//user to enter the input
			System.out.println("Enter the name: "); 
			this.employeeName = input.nextLine();
		
			System.out.println("Enter the age: "); 
			this.age = input.nextInt();
		
			System.out.println("Enter the phone number: "); 
			this.phoneNumber = input.nextInt();
		
			System.out.println("Enter the position [0 for clerk, 1 for supervisor, 2 for manager]: "); 
			this.selection = input.nextInt();
			
			System.out.print("Please enter the type of position [1 for part-time, 2 for full-time]: ");
			this.choose = input.nextInt();
		
			System.out.println("Enter the gender [M for male, F for female]: "); 
			this.gender = input.next().charAt(0);
		
		if(selection == 0) { //selection 0 clerk
			if(choose == 1) {  //choose part time
				System.out.print("Please enter the number of quantity: ");
				this.quantity = input.nextInt();
				
				Payment clerk = new totalSalary(); //2.5 Interface
				salary = clerk.Rentprice(selection, choose, quantity);//salary for part time clerk
				totalPayment = clerk.getPayment(selection, choose, quantity);  //initialize the total paid for part time clerk
				System.out.println("Name				: " + this.getEmployeeName());
				System.out.println("Gender				: " + this.getGender());
				System.out.println("Age				: " + this.getAge());
				System.out.println("Phone number			: " + this.getPhoneNumber());
				System.out.println("Position			: Clerk");
				System.out.println("Type of job        		: Part time");	
				System.out.println("Paid per day			: RM "+ salary);
				System.out.println("Total payment 			: RM " + df2.format(totalPayment));
			} //end choose part time
			
			else if(choose == 2) {  //choose full time
				Payment clerk = new totalSalary();  //2.5 Interface
				salary = clerk.Rentprice(selection, choose, quantity);  //salary for full time clerk
				epf = clerk.discount();  //epf of full time clerk
				totalPayment = clerk.getPayment(selection, choose, quantity, epf);//initialize the total paid for full time clerk
				System.out.println("Name					: " + this.getEmployeeName());
				System.out.println("Gender					: " + this.getGender());
				System.out.println("Age					: " + this.getAge());
				System.out.println("Phone number				: " + this.getPhoneNumber());
				System.out.println("Position				: Clerk");
				System.out.println("Type of job        			: Full time");
				System.out.println("Salary per month			: RM "+ salary);
				System.out.println("Total salary after minus EPF for a month: RM " + df2.format(totalPayment));
			}  //end choose full time
		}//end selection 1 clerk
		
		else if(selection == 1) { //start selection 1 supervisor
			if(choose == 1) {  //choose part time
				System.out.print("Please enter the number of quantity: ");
				this.quantity = input.nextInt();
				
				Payment supervisor = new totalSalary(); //2.5 Interface
				salary = supervisor.Rentprice(selection, choose, quantity);//salary for part time supervisor
				totalPayment = supervisor.getPayment(selection, choose, quantity);  //initialize the total paid for part time supervisor
				System.out.println("Name				: " + this.getEmployeeName());
				System.out.println("Gender				: " + this.getGender());
				System.out.println("Age				: " + this.getAge());
				System.out.println("Phone number			: " + this.getPhoneNumber());
				System.out.println("Position			: Supervisor");
				System.out.println("Type of job        		: Part time");	
				System.out.println("Paid per day			: RM "+ salary);
				System.out.println("Total payment 			: RM " + df2.format(totalPayment));
			} //end choose part time
			
			else if(choose == 2) {  //start choose full time
				Payment supervisor = new totalSalary();  //2.5 Interface
				salary = supervisor.Rentprice(selection, choose, quantity);  //salary for full time supervisor
				epf = supervisor.discount();  //epf of full time supervisor
				totalPayment = supervisor.getPayment(selection, choose, quantity, epf);//initialize the total paid for full time supervisor
				System.out.println("Name					: " + this.getEmployeeName());
				System.out.println("Gender					: " + this.getGender());
				System.out.println("Age					: " + this.getAge());
				System.out.println("Phone number				: " + this.getPhoneNumber());
				System.out.println("Position				: Supervisor");
				System.out.println("Type of job        			: Full time");
				System.out.println("Salary per month			: RM "+ salary);
				System.out.println("Total salary after minus EPF for a month: RM " + df2.format(totalPayment));
			}  //end choose full time
		} //end selection 1 supervisor
		
		else if(selection == 2) { //selection 2 manager
			if(choose == 1) {  //start choose part time
				System.out.print("Please enter the number of quantity: ");
				this.quantity = input.nextInt();
				
				Payment clerk = new totalSalary(); //2.5 Interface
				salary = clerk.Rentprice(selection, choose, quantity);//salary for part time manager
				totalPayment = clerk.getPayment(selection, choose, quantity);  //initialize the total paid for part time manager
				System.out.println("Name				: " + this.getEmployeeName());
				System.out.println("Gender				: " + this.getGender());
				System.out.println("Age				: " + this.getAge());
				System.out.println("Phone number			: " + this.getPhoneNumber());
				System.out.println("Position			: Manager");
				System.out.println("Type of job        		: Part time");	
				System.out.println("Paid per day			: RM "+ salary);
				System.out.println("Total payment 			: RM " + df2.format(totalPayment));
			} //end choose part time
			
			else if(choose == 2) {  //start choose full time
				Payment clerk = new totalSalary();  //2.5 Interface
				salary = clerk.Rentprice(selection, choose, quantity);  //salary for full time manager
				epf = clerk.discount();  //epf of full time manager
				totalPayment = clerk.getPayment(selection, choose, quantity, epf);//initialize the total paid for full time manager
				System.out.println("Name					: " + this.getEmployeeName());
				System.out.println("Gender					: " + this.getGender());
				System.out.println("Age					: " + this.getAge());
				System.out.println("Phone number				: " + this.getPhoneNumber());
				System.out.println("Position				: Manager");
				System.out.println("Type of job        			: Full time");
				System.out.println("Salary per month			: RM "+ salary);
				System.out.println("Total salary after minus EPF for a month: RM " + df2.format(totalPayment));
			}  //end choose full time
		} //end selection 3 manager
	}
	
	//2.2 Polymorphism	
	public void printInfo() {  
		System.out.println("EMPLOYEE PART");
		System.out.println("CLOTHING RENTAL CENTER");
		System.out.println("========================");
	}
	
	//2.3 Encapsulation
	//Create getter method
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
} //end class of Employees
