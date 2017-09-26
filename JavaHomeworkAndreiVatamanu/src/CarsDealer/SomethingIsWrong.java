/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsDealer;

import java.awt.Rectangle;

/**
 *
 * @author Samsung
 */
public class SomethingIsWrong {

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle () ;
myRect.width = 40;
System.out.println("The value of width is: " + myRect.width );
myRect.height = 50;
System.out.println("The value of height is: " + myRect.height );
 int area = myRect.width * myRect.height;
System.out.println("myRect's area is " + area);

    }
    }
    /**Answer: The code never creates a Rectangle object. 
With this simple program, the compiler generates an error. 
However, in a more realistic situation, myRect might be initialized to null in one place, say in a constructor, and used later. In that case, the program will compile just fine, but will generate a NullPointerException at runtime.*/
