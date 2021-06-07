package Assignment2;

public class totalRentPrice implements Payment { //2.5 Interface
	
	public double discount() {
		return 0.2;
	}
	
	public double Rentprice(int selection, int choose, int quantity) {  //method to calculate rental price per day
		double price = 0;
		
				if(selection == 1) { //selection 1
						if(choose == 0) { //choose 0
							if(quantity <= 10)
								return price = 213;
							else
								return price = 213-213*discount();	
						}  //end choose 1
						
						else if(choose == 1) { //choose 1
							if(quantity <= 10)
								return price = 113;
							else
								return price = 113-113*discount();	
						}  //end choose 1
						
						else if(choose == 2) { //choose 2
							if(quantity <= 10)
								return price = 103;
							else
								return price = 103-103*discount();	
							} //end choose 2
						} //end selection 3
						
				else if(selection == 2) {  //election 2
							if(choose == 0) { //choose 0
								if(quantity <= 10)
									return price = 243;
								else
									return price = 243-243*discount();	
							}  //end choose 0
							
							else if(choose == 1) { //choose 1
								if(quantity <= 10)
									return price = 123;
								else
									return price = 123-123*discount();	
							}  //end choose 1
							
							else if(choose == 2) { //choose 2
								if(quantity <= 10)
									return price = 103;
								else
									return price = 103-103*discount();	
								}  //end choose 2
							}  //end selection 2
						
				else if(selection == 3) { //selection 3
						if(choose == 0) { //choose 0
							if(quantity <= 10)
								return price = 433;
							else
								return price = 433-433*discount();	
						}  //end choose 0
						
						else if(choose == 1) { //choose 1
							if(quantity <= 10)
								return price = 613;
							else
								return price = 613-613*discount();	
						}  //end choose 1
						
						else if(choose == 2) { //choose 2
							if(quantity <= 10)
								return price = 533;
							else
								return price = 533-533*discount();	
							}  //end choose 2
						}  //end selection 3
				
				
				return price;
		}  //end of method RentPrice
	
	public double getPayment(int selection, int choose, int quantity) {  //method with 3 arguments implement form class interface to calculate total payment
		return quantity*Rentprice(selection, choose, quantity);
	}
	
	public double getPayment(int selection, int choose, int quantity, double discount) {  //method with 4 arguments implement form class interface to calculate total payment
		return quantity*Rentprice(selection, choose, quantity);
	}
	

} //end class of totalRentPrice
