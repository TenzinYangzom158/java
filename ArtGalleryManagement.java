// Tenzin Yangzom
// 2147158
// 3MCA-A

// Art Gallery Management 

import java.util.Scanner;

//Main Class
class ArtGalleryManagement{
	
	String name = "\n\tArt Gallery Management";
	//Main driver method
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("\n--------Art Gallery Management System--------");
		System.out.println("\n1. Admin");
		System.out.println("2. Artist");
		System.out.println("3. Product- Art Piece");
		System.out.println("4. Customer Details");
		System.out.println("5. Art Auction");
		System.out.println("6. Exhibition");
		System.out.println("7. Competition");
		System.out.println("\nEnter your choice: ");
		
		choice = scan.nextInt();

		if(choice == 1){
			System.out.println("--------Admin Controller--------");
			//Admin admin1 = new Admin(1,"Yangzom",97566,"yangzom@gmail.com","PASSWORD");
			//System.out.println("\nCheck Password: "+admin1.validateUser("PASSWORD"));
			//Admin admin2 = admin1;

			// Lab6: String class
			String username, password;
			Scanner s= new Scanner(System.in);
			System.out.print("Enter username: ");
			username = s.nextLine();
			System.out.print("Enter password: ");
			password = s.nextLine();
			if(username.equals("Tenzin") && password.equals("Tenzin@123"))
			{
				System.out.println("Authentication Successful!");
			}
			else
			{
				System.out.println("Authentication Failed!");
			}
	
			

		}else if(choice == 2) {

			
			//Artist artist = new Artist();
			//artist.getArtistDetails();

			//Creating multiple objects by one type
			Artist artist1 = new Artist(), artist2 = new Artist();
		
			artist1.setArtistDetails(101,"Picasso","Abstract Art");
			artist2.setArtistDetails(102,"David","Digital Art");
		
			System.out.println("--------------Artist Details------------------");
			//System.out.println("\nBefore Shallow Copy : ");
			artist1.getArtistDetails();
			artist2.getArtistDetails();

			//Shallow Copy
			//Artist artist3 = artist2;
			//artist3.setArtistDetails(102,"David","Freestyle");
			//artist3.getArtistDetails();
			//artist2.getArtistDetails();
			System.out.println("---------------------------------------");

		}else if(choice == 3){

			//create an array of product object   
			Product[] product = new Product[5] ;  
			//create & initialize actual product objects using constructor  
			product[0] = new Product(10001,"Self-Portrait Without Beard","Vincent van Gogh",715000.5);  
			product[1] = new Product(10002,"The Scream","Edvard Munch",915000.5);  
			product[2] = new Product(10003,"American Gothic","Grant Wood",998900.5);  
			product[3] = new Product(10004,"Nighthawks","Edward Hopper",909000.5);  
			product[4] = new Product(10005,"La Danse","Henri Matisse",675000.5);  
			//display the product object data  
			//System.out.println("\n\tArt Piece 1:");  
			//product[0].getProductDetails();  
			//System.out.println("\n\tArt Piece 2:");  
			//product[1].getProductDetails();  
			//System.out.println("\n\tArt Piece 3:");  
			//product[2].getProductDetails();  
			//System.out.println("\n\tArt Piece 4:");  
			//product[3].getProductDetails();  
			//System.out.println("\n\tArt Piece 5:");  
			//product[4].getProductDetails(); 

			for(int i=0; i<product.length;i++){
				System.out.println("\n\tArt Piece "+(i+1)+":");  
				product[i].getProductDetails(); 
			}

		}else if(choice == 4){
			// Customer Details : Initializing object using method
			Customer customer1 = new Customer();
			Customer customer2 = new Customer();
			customer1.setCustomerDetail(201,"Tenzin");
			customer2.setCustomerDetail(202,"Yangzom");
			customer1.displayCustomerDetails();
			customer2.displayCustomerDetails();
			
			// 
			new Customer(203,"Ruby",500);
			//System.out.println("Id: "+cc.customerId+" Name: "+cc.customerName);

		}else if(choice == 5){
			//Anonymous class extending a class
			FinalAuction fa = new FinalAuction();
			fa.finalAuctionPrice();

			Auction auction1 = new Auction();
			auction1.initialAuctionPrice("Art Piece 1 ",5000);
			auction1.showAuctionPrice();
			//Shallow Copy
			Auction auction2 = auction1;
			//auction2.initialAuctionPrice("Art Piece 1 ",15000);
			auction2.showAuctionPrice();
			

		}else if(choice == 6){
			System.out.println("\n\tWelcome to the Art Exhibition 2022");
			System.out.println("\n1. Search Exhibition location");
			System.out.println("2. Timing of the exhibition"); //Durantion 
			System.out.println("3. Total Ticket Available/Sold");
			System.out.println("4. Buy/Sell Ticket");
			System.out.println("\nEnter your choice: ");
			
			int exhibitionChoice = scan.nextInt();
			if(exhibitionChoice == 1) {
				Exhibition location = new Exhibition();
				location.getLocations("New York");
				location.getLocations("Paris",324233);
				location.getLocations("Chicago","The Glass Curtain Gallery");

			}else if(exhibitionChoice == 2){
			
				String startTime = "11:00";
				String endTime = "13:00";
				Exhibition timing = new Exhibition(startTime, endTime);
				timing.printStartTime();
				timing.printEndTime();
				
				Exhibition newTiming = new Exhibition();
				//Deep Copy
				newTiming.startTime = timing.startTime;
				newTiming.endTime = timing.endTime;
				newTiming.printStartTime();
				newTiming.printEndTime();
				
			}else if(exhibitionChoice == 3){

			}else if(exhibitionChoice == 4){

			}else {
				System.out.println("Invalid");
			}

		}else if(choice == 7){
			Competition c1 = new Competition(77);
			Competition c2 = new Competition(100);
			Competition c3 = new Competition(81);
			System.out.println(" Max Point: " +Competition.maxPoint);
			// Creating instance of nested Static class
			Competition.CompName printer = new Competition.CompName();
			// Calling non-static method of nested static class
			printer.printCompetitionName();

			Competition.competitionDetail("21");
			Competition.competitionDetail("21","A");
			System.out.println("---------------------------------------");

			//String Buffer
			System.out.println("---String Buffer---");
			StringBuffer sb1 = new StringBuffer("Art ");
	  		StringBuffer sb2 = new StringBuffer("Year ");
	  		StringBuffer sb3 = sb1.append("Competition");
	  		StringBuffer sb4 = sb2.append(2022);
	  		System.out.println(sb3);
	  		System.out.println(sb4);
	  		//length() and capacity()
	  		System.out.println("Length of the StringBuffer:"+sb3.length());
	  		System.out.println("Capacity of the StringBuffer:"+sb3.capacity());
	  		
	  		//insert() 
	  		sb1.insert(0,"Annual ");
	  		System.out.println("\n"+sb3);


	  		//String Builder
	  		StringBuilder sbObj=new StringBuilder();  
			System.out.println("Default Capacity:"+sbObj.capacity());//default 16 
		
			sbObj.append("Java StringBuilder Class ");  

			System.out.println("Capacity of "+sbObj+"is "+sbObj.capacity());// capacity 34	

			sbObj.ensureCapacity(12);// no change  
			System.out.println("After applying ensure capacity: "+sbObj.capacity());//still 34  

			sbObj.ensureCapacity(60); // (34*2)+2 = 70 
		   System.out.println("Applying ensure capacity again: "+sbObj.capacity()); //70 





		}



		System.out.println("---------------------------------------");
		try {
 
            Class cls = Class.forName("ArtGalleryManagement");
 
            // Creating object of main class
       		// using newInstance() method
            ArtGalleryManagement obj = (ArtGalleryManagement)cls.newInstance();
 
            // Print and display
            //System.out.println(obj.name);
        	}
		
		// Catch block to handle the exceptions
 
        	// Catch block 1
        	// Handling ClassNotFound Exception
        	catch (ClassNotFoundException e) {
 
            // Display the exception along with line number
            // using printStacktrace() method
            e.printStackTrace();
        	}
 
        	// Catch block 2
        	// Handling InstantiationException
        	catch (InstantiationException e) {
 
            e.printStackTrace();
        	}
 
        	// Catch block 2
        	// Handling IllegalAccessException
        	catch (IllegalAccessException e) {
 
            e.printStackTrace();
        	}

		


		//admin object created
		//Admin admin1 = new Admin(1,"Yangzom",97566,"yangzom@gmail.com","PASSWORD");
		//System.out.println("\nCheck Password:- "+admin1.validateUser("PASSWORD"));
		//reference variable


		
	}
}

class Admin{
	//instance variable
	private int id;    				//private instance
	private String name;
	private long mobile;
	private String email;
	private String password;

	public int getId() {				//instance method
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return this.mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Constructor
	public Admin(int id, String name, long mobile, String email, String plainPassword){
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.email=email;
		this.password=securePassword(plainPassword);
	}
	
	private String securePassword(String plainPassword){
		return "SECURE"+plainPassword;
	}
	public Boolean validateUser(String plainPassword){
		return this.password.equals(securePassword(plainPassword));
	}
}


class Artist{
	private int artistId;  			//default: access modifier
	public String artistName;
	public String style;

	public void setArtistDetails(int artistId, String artistName, String style){
		this.artistId = artistId;
		this.artistName = artistName;
		this.style = style;
	}

	public void getArtistDetails(){
		System.out.println("\nArt Id : "+artistId+"\nArtist Name : "+artistName+"\nArt Style: "+style);
	}

}


class Product extends Artist{
	private int productId;
	public String productName;
	//String artistName; 
	public double productPrice;

	//Constructor
	Product(int productId, String productName, String artistName, double productPrice){
		this.productId = productId;
		this.productName = productName;
		this.artistName = artistName;
		this.productPrice = productPrice;
	}

	public void getProductDetails(){
		System.out.print("\nProduct Id = "+productId+ "\nProduct Name = "+productName+"\nArtist Name = "+artistName+"\nProduct Price = "+productPrice);  
		System.out.println();  
	}
}

//Initializing using reference variable and method
class Customer{
	int customerId;
	String customerName;
	

	//methods
	void setCustomerDetail(int id, String name){
		customerId = id;
		customerName = name;
	}
	
	void displayCustomerDetails(){
		System.out.println("\nCustomer Id:"+customerId+" Customer Name:"+customerName);
	}

	//CONSTRUCTOR CHAINING
	Customer(){
		System.out.println("\nCustomer chaining");
	}
	//parameterized constructor
	Customer(int id, String name){
		this();
		customerId=id;
		customerName=name;
		System.out.println("Constructor with 2 parameter:- "+"ID :"+id+"\tNAME :"+name);
	}
	Customer(int id, String name, int price){
		this(id,name);
		System.out.println("Constructor with 3 parameter:- "+"ID :"+id+"\tNAME :"+name+"\tPRICE: "+price);
	}
}


class Auction{
	private int Id;
	private  String auctionName;
	public double auctionPrice;
	public double finalPrice;
	public String artistName;

	public void initialAuctionPrice(String auctionName, int auctionPrice) {
		this.auctionName = auctionName;
		this.auctionPrice = auctionPrice;
	}	
	
	public void showAuctionPrice() {
      	System.out.println("Auction Item: "+auctionName+"Auction Price: "+auctionPrice);
	}
}


//Anonymous Class
class FinalAuction{
	public void finalAuctionPrice(){
	// creation of anonymous class extending class Auction
      Auction auction = new Auction() {
         public void showAuctionPrice() {	
            System.out.println("\nFinal Auction Price is: ");
         }
      };
      auction.showAuctionPrice();
	}
}


//Lab3 

class Gallery{
	private int galleryId;
	public String galleryName;
	public String galleryLocation;
	public int locationPinCode;
}

class Exhibition{
	private int exhibitId;
	public String startDate;
	public String startTime; //Date datatype/format in java
	public String endTime;
	public String galleryName; // Exhibition in which gallery
	public String totalDuration;
	private int ticketPrice;
	

	//Exhibition happening in multiple locations - method overloading
	//changing number of arguments
	//changing data types
	public void getLocations(String loc){
		System.out.println("Exhibition held in :"+loc);
	}
	public void getLocations(String loc, int pincode){
		System.out.println("Exhibition held in :"+loc+"\tPincode :"+pincode);
	}

	public void getLocations(String loc, String gallery){
		System.out.println("Exhibition held in :"+loc+"\tGallery Name :"+ gallery);
	}

	Exhibition(String startTime, String endTime){
		this.startTime = startTime;
		this.endTime = endTime;
	}

	Exhibition(){}

	
	public void printStartTime(){
		System.out.println("\nExhibition starts at :"+startTime);
	}

	public void printEndTime(){
		System.out.println("Exhibition ends at :"+endTime);
	}
}


//lab 5
class Competition{
	static String competitionDate;
	public static String competitionName; 
	static String artistName; 

	private double point;
	//static variable
	public static double maxPoint;  

	//static block
	static{
		maxPoint = 0;
		competitionDate = "21/02/2022";
		competitionName = "Painting Competition 2022";
		System.out.println("\n-----------ART COMPETITION------------ \n");
	}
	public Competition(double p){
		point = p;
		if(p > maxPoint)
			maxPoint = p;
	}

	//overloading of static method
	public static void competitionDetail(String date){
		System.out.println("\n Competition Date: " + competitionDate);
	}	

	public static void competitionDetail(String date, String name){
		System.out.println(" Competition Date: " + competitionDate + " Competition Name: "+competitionName);
	}	

	//static nested class
	public static class CompName{
		public void printCompetitionName(){
			System.out.println(" Competition Name: " + competitionName);
		}
	}

}


