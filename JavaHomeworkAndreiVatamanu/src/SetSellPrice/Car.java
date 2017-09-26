/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetSellPrice;

/**
 *
 * @author Samsung
 */
public class Car {
    /** 
	@enum enumeration of accepted car colors 
	*/ 
	 
	public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK }; 
        public enum name {BMW,MERCEDES,VW,DACIA,BENTLEY};
	/** 
	Internal hidden fields / attributes 
	*/
	 	 
	private Color color; 
	private String name; 
	private short speed; 
	private int CarPrice; 	 
	private int dailyRentPrice;
	 
	public int getInitPrice() {	 
		return CarPrice;
	}
	
	public void setInitPrice(int CarPrice) {
		this.CarPrice = CarPrice;
	}
	 	 
	/** 
	Constructors  
	*/ 
	 
	public Car(){ 
		name = "Default car name"; 
		speed = 90;
            int price = 0;
	} 
	 
	public Car(String carName, short carSpeed, Color carColor, int CarPrice){  
		name = carName; 
		speed = carSpeed; 
		color = carColor; 
		CarPrice = CarPrice;
	} 
	 
	 
	public String getName(){ 	 
		return(name); 
	} 
	 
	public Color getColor(){ 
		return(color); 
	} 
	 
	public short getSpeed(){ 
		return(speed); 
	} 
	 
	public void setName(String newName){ 
		name = newName; 
	}
	 
	public void setColor(Color newColor){ 
		color = newColor; 
	} 
	 
	public void setSpeed(short newSpeed){ 
		speed = newSpeed; 
	} 
        
        public void setPrice(int newPrice){
        CarPrice = newPrice;
}
	 
	/** 
	The method increase actual speed of Car until final speed specified.  
	* @param newSpeed is new speed 
	*/ 
	 
	public void increaseSpeed(short newSpeed){ 
		if(newSpeed > speed){ 
			speed = newSpeed; 
		} 	 
		else if (newSpeed < speed){ 
			decreaseSpeed(newSpeed); 
		} 
	} 
	 
	/** 
	The method decrease actual speed of Car until final speed specified. 
	* @param newSpeed is new speed 
	*/ 
	 
	public void decreaseSpeed(short newSpeed){ 
	if(newSpeed < speed){ 	 
		speed = newSpeed; 
		} 
	else if (newSpeed < speed){ 
		increaseSpeed(newSpeed); 
		} 
	} 
	 
	/** 
	Abstract method defined in Saleable interface implemented by class car 
	* is implemented here. 
	* @return 
	* @override Saleable.getSalePrice() method 
	*/ 
	 
	public int getSalePrice(){ 
            int salePrice = 0;
	//return(12000); 
		return salePrice;
	} 
	 
	public float getVatAmount(){
            double initPrice = 0;
		return (float)(0.19*initPrice); //VAT rate applied by the seller
	}
	
	/** 
	Abstract method defined in Rentable interface implemented by class car 
	* is implemented here.  
	* @return 
	* @override Rentable.getDailyRentPrice() method 
	*/ 
	 
	public int getDailyRentPrice(){ 
		//return(250); 
		return dailyRentPrice;
	}
 
	public void setDailyRentPrice(int rentAmount){
		dailyRentPrice = rentAmount;
	}
	 
	public void setSalePrice(int sellerAmount){		 
            int initPrice = 0;
            int salePrice = initPrice + (int)(getVatAmount()) + sellerAmount;
	}

    
}
