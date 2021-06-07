package Assignment2;

//Pre-defined class
//to avoid too many decimal places at the end of calculation
import java.text.DecimalFormat; 

//subclass of Sales
//2.1 Inheritance
//class of Finance
public class Finance extends Sales { 
	
	protected double employeeSalary, inventExpenses, utilitiesFees, maintenanceFees, advertiseFees; //declaring variables of data fields
	
	public Finance(double sales, double es, double ie, double uf, double mf, double af) { // constructor with 6 arguments
		 
		super(sales);
		//initialization of data fields
		this.employeeSalary = es;
		this.inventExpenses = ie;
		this.utilitiesFees = uf;
		this.maintenanceFees = mf;
		this.advertiseFees = af;
		
		DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
		super.printInfo();
		printInfo(); //2.2 Polymorphism
		
		//print the finance of company
		System.out.println("FINANCIAL STATEMENT OF A MONTH");
		System.out.println("=================================");
		System.out.println("Total employees salary	: RM " + this.employeeSalary);
		System.out.println("Total inventory fees	: RM " + this.inventExpenses);
		System.out.println("Total utilities fees	: RM " + this.utilitiesFees);
		System.out.println("Total maintenance fees  : RM " + this.maintenanceFees);
		System.out.println("Total advertisement fees: RM " + this.advertiseFees);
		System.out.println("Total expenses          : RM " + df2.format(totalExpenses()));
		System.out.println("Total sales             : RM " + this.sales);
		System.out.println("Net profit              : RM " + df2.format(netProfit()));
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("=================================");
	}
	
	public double totalExpenses() { //method to calculate total expenses
		return employeeSalary + inventExpenses + utilitiesFees + maintenanceFees + advertiseFees;
	}
	
	public double netProfit() { //method to calculate net profit
		return sales-totalExpenses();
	}
	
	public void printInfo() {  //2.2 Polymorphism
		System.out.println("Financial Statement of One Month.");
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("=================================");
	}
	
} //end class of Finance
				
	
	


