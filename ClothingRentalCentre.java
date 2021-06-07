package Assignment2;

//2.4 Abstraction
//super class for Advertisement Marketing
//class of Clothing Rental Center
public abstract class ClothingRentalCentre {
	
	//declaring variables for data fields
		protected String companyName, companyAddress, companyWebsite;
		protected int companyPhoneNumber;
		
		public ClothingRentalCentre(String cn, String ca, String cw, int cpn) { //constructor with 4 arguments
																				
			//initialization of data fields
			this.companyName = cn;
			this.companyAddress = ca;
			this.companyWebsite = cw;
			this.companyPhoneNumber = cpn;
			
		}
		
		public abstract void printInfo(); //2.2 Polymorphism
		
} //end class of ClothingRentalCentre


