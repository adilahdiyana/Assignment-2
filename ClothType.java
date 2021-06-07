package Assignment2;

//class of Cloth Type
//super class of customer
public class ClothType {
	
protected String material, brand, type; //declaring type and brand variables
		
		public ClothType() { //Constructor with no argument
			setType("Fashion Modern, Traditional Customs, Dinner Dress");
		}
		
	
	public String printInfoFashionModern() { //method to print the info of FashionModern
		setBrand("NIKE, ZARA, GUCCI");
		setMaterial("Fabric, High cotton, Canvas");
		return "Type    	  : " + getType() 
				+ "\nBrand	          : " + this.getBrand()
				+ "\nMaterial          : " + this.getMaterial()
				+ "\nStocks	          : 10, 15, 20"
				+ "\nSize	          : S, M L"
				+ "\nRent price per day: RM 120, RM 220, RM 320";
	}
	
	public String printInfoTraditionalCustoms() { //method to print out the info of TraditionalCustoms
		setBrand("Kilts, Tracht, Gho");
		setMaterial("Fabrics, Fabrics, Fabric");
		return "Type		  : " + getType() 
				+ "\nBrand	          : " + this.getBrand()
				+ "\nMaterial          : " + this.getMaterial()
				+ "\nStocks	          : 5, 6, 11"
				+ "\nSize	          : S, M, XL"
				+ "\nRent price per day: RM 213, RM 313, RM 413";
	}
		
	public String printInfoDinnerDress() { //method to print out the info of DinnerDress
		setBrand("Frozen, Roll, Viltage");
		setMaterial("Fabric, Fabric rolls, Woven fabrics");
		return "Type		  : " + getType()
				+ "\nBrand	          : " + this.getBrand()
				+ "\nMaterial          : " + this.getMaterial()
				+ "\nStocks	          : 15, 12, 10"
				+ "\nSize	          : M, L, XXL"
				+ "\nRent price per day: RM 153, RM 253, RM 353";
	}
	
	public void printInfo() { //2.2 Polymorphism
		System.out.println("INFORMATION OF CLOTHES");
		System.out.println("==========================");
	}
	
	//2.3 Encapsulation
	//Create Setter Method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//Create Getter Method
	public String getType() {
		return this.type;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
} //end class of ClothType


