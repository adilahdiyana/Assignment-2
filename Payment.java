package Assignment2;

//2.5 Interface
//class of Payment
public interface Payment { 
	
	double discount();
	double Rentprice(int selection,int choose, int quantity);
	double getPayment(int selection,int choose,int quantity);
	double getPayment(int selection,int choose, int day, double discount);


} //end class of Payment
