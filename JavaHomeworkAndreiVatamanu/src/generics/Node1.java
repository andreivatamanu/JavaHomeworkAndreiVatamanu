/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Samsung
 */

//5. Will the following code compile? If not, why?
public class Node1 {
    public static void main (String[] args){
    Node<Circle> nc = new Node<>(); //this will compile - the compiler will use type inference to determine the type
    //Node<Shape>  ns = nc; //undefined inheritance between Node<Shape> and Node<Circle>
}
    
    //class Shape { /* ... */ }
//class Circle extends Shape { /* ... */ }
//class Rectangle extends Shape { /* ... */ }
//class Node<T> { /* ... */ }   
}

//Answer: No. Because Node<Circle> is not a subtype of Node<Shape>. Undefined inheritance between Node<Shape> and Node<Circle>