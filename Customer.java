package Assignment2;

//pre-defined class
//user input
import java.util.Scanner;
import java.text.DecimalFormat;

//class of customer
//subclass of cloth type
public class Customer extends ClothType { 
					
	
	Scanner input = new Scanner(System.in); //user to enter the input
	DecimalFormat df2 = new DecimalFormat("#.##"); //to avoid too many decimal places at the end of answer
	
	//declaring variables for data fields
	protected String customerName;
	protected int age, phoneNumber, selection, choose, quantity;
	protected char gender;
	protected double RentPrice, totalPrice;
	
	public Customer() { //constructor with no argument
		
		printInfoFashionModern(); //print info for fashion modern
		printInfoTraditionalCustoms(); //print info for traditional customs
		printInfoDinnerDress(); //print info for dinner dress
		printInfo(); //2.2 Polymorphism
		
		System.out.println("INFORMATION OF EMPLOYEE");
		System.out.println("==========================");
		//user to enter the input
		System.out.print("Enter the name: "); //print customer name
		this.customerName = input.nextLine();
			
		System.out.print("Enter the age: "); //print age customer
		this.age = input.nextInt(); 
		
		System.out.print("Enter the gender [M for male, F for female]: "); //print customer gender
		this.gender = input.next().charAt(0);
	
		System.out.print("Enter the phone number: "); //print phone number customer
		this.phoneNumber = input.nextInt();
		
		System.out.print("Enter the type of cloth that you want to select and rent [0 for Fashion Modern, 1 for Traditional Customs, 2 for Dinner Dress]: "); //selection type of cloth for customer
		this.selection = input.nextInt();
		
			switch(selection) {
				
			case 1 :System.out.print("Select the brand of cloth:\n[0 for NIKE, 1 for ZARA, 2 for GUCCI]: "); //selection for cloth type of Fashion Modern
					this.choose = input.nextInt();
					
					if (choose == 0) { //choose for NIKE
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
											
						if(quantity <= 10) { //quantity less or equal to 10
							Payment NIKE = new totalRentPrice(); //2.5 Interface
							this.RentPrice= NIKE.Rentprice(selection, choose, quantity); //price for NIKE if rent less than or equal 10 quantity
							this.totalPrice= NIKE.getPayment(selection, choose, quantity);  //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: NIKE " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //quantity more than 10
							
							Payment NIKE = new totalRentPrice(); //2.5 Interface
							double discount = NIKE.discount();
							this.RentPrice= NIKE.Rentprice(selection, choose, quantity); //price for NIKE if rent less than or equal 10 quantity
							totalPrice= NIKE.getPayment(selection, choose, quantity, discount);  //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: NIKE " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for choose 0
			
					if (choose == 1) { //choose for ZARA
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
												
						if(quantity <= 10) { //quantity less or equal to 10
							Payment ZARA = new totalRentPrice(); //2.5 Interface
							this.RentPrice= ZARA.Rentprice(selection, choose, quantity); //price for ZARA if rent less than or equal 10 quantity
							this.totalPrice= ZARA.getPayment(selection, choose, quantity); //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: ZARA " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //quantity more than 10
							
							Payment ZARA = new totalRentPrice(); //2.5 Interface
							double discount = ZARA.discount();
							this.RentPrice= ZARA.Rentprice(selection, choose, quantity); //price for ZARA if rent less than or equal 10 quantity
							totalPrice= ZARA.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: ZARA" ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for choose 1
			
					if (choose == 2) { //choose for GUCCI
						System.out.print("Enter number of rental quantity: ");
						this.quantity = input.nextInt();
						
						if(quantity <= 10) { //quantity less or equal to 10
							Payment GUCCI = new totalRentPrice(); //2.5 Interface
							this.RentPrice= GUCCI.Rentprice(selection, choose, quantity); //price for GUCCI if rent less than or equal 10 quantity
							this.totalPrice= GUCCI.getPayment(selection, choose, quantity); //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: GUCCI " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							} //end for quantity less than 10
					
						else { //quantity more than 10
							
							Payment GUCCI = new totalRentPrice(); //2.5 Interface
							double discount = GUCCI.discount();
							this.RentPrice= GUCCI.Rentprice(selection, choose, quantity); //price for GUCCI if rent less than or equal 10 quantity
							totalPrice= GUCCI.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
							System.out.println("Name				    : " + this.customerName); //print customer name
							System.out.println("Gender				    : " + this.gender); //print customer gender
							System.out.println("Age				        : " + this.age); //print customer age
							System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
							System.out.println("Brand of cloth			: GUCCI " ); //print cloth selected by customer
							System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
							System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
							System.out.println("CLOTHING RENTAL CENTRE");
							System.out.println("===================================");
							} //end for quantity more than 10
						} //end for choose 2
					
							break; //break for switch case 1 
							
			case 2 :System.out.print("Select the brand of cloth:\n[0 for Kilts , 1 for Tracht, 2 for Gho]: "); //selection for cloth type of Traditional Customs
			this.selection = input.nextInt();
			
			if (choose == 0) { //choose for Kilts
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Kilts = new totalRentPrice(); //2.5 Interface
					this.RentPrice= Kilts.Rentprice(selection, choose, quantity); //price for Kilts if rent less than or equal 10 quantity
					this.totalPrice= Kilts.getPayment(selection, choose, quantity); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Kilts " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //quantity more than 10
					
					Payment Kilts = new totalRentPrice(); //2.5 Interface
					double discount = Kilts.discount();
					this.RentPrice= Kilts.Rentprice(selection, choose, quantity); //price for Kilts if rent less than or equal 10 quantity
					totalPrice= Kilts.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Kilts " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 0
	
			if (choose == 1) { //choose for Tracht
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
				
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Tracht = new totalRentPrice(); //2.5 Interface
					this.RentPrice= Tracht.Rentprice(selection, choose, quantity); //price for Tracht if rent less than or equal 10 quantity
					this.totalPrice= Tracht.getPayment(selection, choose, quantity); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Tracht" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { // quantity more than 10
					
					Payment Tracht = new totalRentPrice(); //2.5 Interface
					double discount = Tracht.discount();
					this.RentPrice= Tracht.Rentprice(selection, choose, quantity); //price for Tracht if rent less than or equal 10 quantity
					totalPrice= Tracht.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Tracht" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 1
	
			if (choose == 2) { //choose for Gho
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Gho = new totalRentPrice(); //2.5 Interface
					this.RentPrice= Gho.Rentprice(selection, choose, quantity); //price for Gho if rent less than or equal 10 quantity
					this.totalPrice= Gho.getPayment(selection, choose, quantity); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Gho" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //quantity more than 10
					
					Payment Gho = new totalRentPrice(); //2.5 Interface
					double discount = Gho.discount();
					this.RentPrice= Gho.Rentprice(selection, choose, quantity); //price for Gho if rent less than or equal 10 quantity
					totalPrice= Gho.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Gho" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 1
			
					break; //break for switch case 2
					
			case 3 :System.out.print("Select the brand of cloth:\n[0 for Frozen , 1 for Roll, 2 for Vintage]: "); //selection for cloth type of Dinner Dress
			this.selection = input.nextInt();
			
			if (choose == 0) { //choose for Frozen
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Frozen = new totalRentPrice(); //2.5 Interface
					this.RentPrice= Frozen.Rentprice(selection, choose, quantity); //price for Frozen if rent less than or equal 10 quantity
					this.totalPrice= Frozen.getPayment(selection, choose, quantity);  //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Frozen " ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //quantity more than 10
					
					Payment Frozen = new totalRentPrice(); //2.5 Interface
					double discount = Frozen.discount();
					this.RentPrice= Frozen.Rentprice(selection, choose, quantity); //price for Frozen if rent less than or equal 10 quantity
					totalPrice= Frozen.getPayment(selection, choose, quantity, discount);  //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Frozen" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 0
	
			if (choose == 1) { //choose for Roll
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Roll = new totalRentPrice(); //2.5 Interface
					this.RentPrice = Roll.Rentprice(selection, choose, quantity); //price for Roll if rent less than or equal 10 quantity
					this.totalPrice= Roll.getPayment(selection, choose, quantity);  //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Roll" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //quantity more than 10
					
					Payment Roll = new totalRentPrice(); //2.5 Interface
					double discount = Roll.discount();
					this.RentPrice= Roll.Rentprice(selection, choose, quantity); //new price for Roll if rent more than 10 quantity 
					totalPrice = Roll.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Roll" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 1
	
			if (choose == 2) { //choose for Vintage
				System.out.print("Enter number of rental quantity: ");
				this.quantity = input.nextInt();
								
				if(quantity <= 10) { //quantity less or equal to 10
					Payment Vintage = new totalRentPrice(); //2.5 Interface
					this.RentPrice= Vintage.Rentprice(selection, choose, quantity); //price for vintage if rent less than or equal 10 quantity
					this.totalPrice= Vintage.getPayment(selection, choose, quantity);  //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Vintage" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					} //end for quantity less than 10
			
				else { //quantity more than 10
					
					Payment Vintage = new totalRentPrice(); //2.5 Interface
					double discount = Vintage.discount();
					this.RentPrice= Vintage.Rentprice(selection, choose, quantity); //new price for vintage if rent more than 10 quantity 
					totalPrice = Vintage.getPayment(selection, choose, quantity, discount); //initialize the total price for rental
					System.out.println("Name				    : " + this.customerName); //print customer name
					System.out.println("Gender				    : " + this.gender); //print customer gender
					System.out.println("Age				        : " + this.age); //print customer age
					System.out.println("Phone number			: " + this.phoneNumber); //print customer phone number
					System.out.println("Brand of cloth			: Vintage" ); //print cloth selected by customer
					System.out.println("The rental price per day: RM "+ df2.format(this.RentPrice)); //print price of quantity for rent per day
					System.out.println("The total rental price: RM "+ df2.format(totalPrice)); //print total price of quantity for rent
					System.out.println("CLOTHING RENTAL CENTRE");
					System.out.println("===================================");
					} //end for quantity more than 10
				} //end for choose 2
			
					break; //break for switch case 3
			}
	}
			
			
	public void printInfo() { //2.2 Polymorphism
		System.out.println("CUSTOMER PART");
		System.out.println("CLOTHING RENTAL CENTRE");
		System.out.println("==========================");
	}
	
} //end class of Customer
	
	


