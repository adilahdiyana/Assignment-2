package Assignment2;

//class of AdvertisementMarketing
//User defined class
//subclass of clothing rental center
//2.1 inheritance
public class AdvertisementMarketing extends ClothingRentalCentre { 
	
	protected double price, discount; //declaring a variable
	
	public AdvertisementMarketing(String cn, String ca, String cw, int cpn) { //constructor with 4 arguments
		super(cn, ca, cw, cpn);
		
		//declare and initialize variable of price and discount
		price = 213;
		discount = 0.2;
		
		printInfo(); //2.2 	Polymorphism
		Advertisement(price, discount);
	
	}

	 //2.2 Polymorphism
    //method with no argument
    public void printInfo() { 
    	System.out.println("INFORMATION OF COMPANY");
    	System.out.println("========================");
    	System.out.println("Company Name		: " + super.companyName);
    	System.out.println("Company Address		: " + super.companyAddress);
    	System.out.println("Company Website		: " + super.companyWebsite);
    	System.out.println("Company Phone Number	: " + super.companyPhoneNumber);
    	
    }

    public void Advertisement(double price, double discount) {  //method with 2 arguments
	System.out.println("REASONABLY PRICE OF CLOTHING RENTAL");
	System.out.println("The rent is at the lowest and affordable prices as RM " + price + " ."); //print the price
	System.out.println("If you rent one of the cloths, you also will get a discount at " + discount*100 + " % just in one day. So, hurry up to get a discount!"); //print the discount
	System.out.println("CLOTHING RENTAL CENTRE");
	System.out.println("========================================================================================================================================");
	
	}

} //end class of AdvertisementMarketing


