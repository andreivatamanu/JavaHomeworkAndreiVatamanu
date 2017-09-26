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
public class Cars extends Car {

	public static void main(String[] args){
        short viteza = 50;
        Car mercedes = new Car("Mercedes", viteza, Car.Color.BLACK, 50000);
        Car bmw = new Car("Bmw", viteza, Car.Color.WHITE, 20000);
         
        mercedes.setSalePrice(1000); 
        mercedes.setDailyRentPrice(200);
         
        bmw.setSalePrice(800); 
        bmw.setDailyRentPrice(150);
         
        System.out.println("Sale price for "+mercedes.getName()+" = "+mercedes.getSalePrice()+" - rent price = "+mercedes.getDailyRentPrice());        
        System.out.println("Sale price for "+bmw.getName()+" = "+bmw.getSalePrice()+" - rent price = "+bmw.getDailyRentPrice());
        
          
	}
    
    }
