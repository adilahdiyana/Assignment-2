package Assignment2;

import java.text.DecimalFormat; //Pre-defined class
								//to avoid too many decimal places at the end of calculation

public class Sales { //class of Sales
					 //User defined class
					 //super class of Finance
	
	DecimalFormat df2 = new DecimalFormat("#.##");
	
	protected double sales; //declaring sales variable
	
	public Sales(double sales) { //constructor with 1 argument
		this.sales = sales;
	}
	
		public void printInfo() { //2.2 Polymorphism
		//print the sales of company
		System.out.println("SALES REPORT");
		System.out.println("=================================================");
		System.out.println("Generally an average of sales every day: RM " + this.sales);
		System.out.println("Sales in a week                        : RM " + df2.format(totalSalesWeek()));
		System.out.println("Sales in a month                       : RM " + df2.format(totalSalesMonth()));
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("==================================================");
	}
	
	public double totalSalesWeek() { //method to calculate total sales in a week
		return this.sales*7; //7 is the number of day in a week
	}
	
	public double totalSalesMonth() { //method to calculate total sales in a month
		return this.sales*30; //30 is the number of day in a month
	}
	
} //end class of Sales
