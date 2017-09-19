/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Samsung
 */
public class Questions3 {
    
}
 /*What exception types can be caught by the following handler?
 catch (Exception e) {
  …
 }
 What is wrong with using this type of exception handler?

Answer: This handler catches exceptions of type Exception; therefore, it catches any exception.
This can be a poor implementation because you are losing valuable information about the type of exception being thrown and making your code less efficient. 
As a result, your program may be forced to determine the type of exception before it can decide on the best recovery strategy.*/