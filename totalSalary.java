package Assignment2;

public class totalSalary implements Payment {  //2.5 Interface  use in class Employee
	
	public double discount() {  
		return 0.05;
	}
	
	public double Rentprice(int selection, int choose, int quantity) {  //method to calculate salary per day
		double price = 0;
		
				if(selection == 1) {    //selection 1
						if(choose == 0) {	//choose 0
								return price = 15;	
						}  //end choose 1
						
						else if(choose == 1) {  //choose 1
								return price = 1500;
	
						}  //end choose 1

					} //end selection 1
						
				else if(selection == 2) {  //selection 2
							if(choose == 0) {  //choose 0
									return price = 50;	
							}  //end choose 0
							
							else if(choose == 1) {  //choose 1
									return price = 1500;	
							}  //end choose 1

						}  //end selection 2
						
				else if(selection == 3) { //selection 3
						if(choose == 0) {  //choose 0
								return price = 150;
						    }
						else if(choose == 1) {  //choose 1
								return price = 350;	
						}  //end choose 1
					}  //end selection 3
				
				return price;
		}  //end of method RentPrice
	
	public double getPayment(int selection, int choose, int quantity) {  //method with 3 arguments implement form class interface to calculate total salary
		return quantity*Rentprice(selection, choose, quantity);
	}
	
	public double getPayment(int selection, int choose, int quantity, double discount) {  //method with 4 arguments implement form class interface to calculate total salary
		quantity = 3;
		return quantity*Rentprice(selection, choose, quantity)*(1-discount);
	}
	
}  //end class of totalSalary
