/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsDealer;

/**
 *
 * @author Samsung
 */
public class Rectangle {
   public int height;

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public int width;

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int area(){
           return width*height;
    }
} 
