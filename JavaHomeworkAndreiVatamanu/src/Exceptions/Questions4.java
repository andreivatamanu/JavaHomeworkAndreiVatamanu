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
public class Questions4 {
    
}
/*Question: Is there anything wrong with this exception handler as written? Will this code compile?
try {

} catch (Exception e) {
   
} catch (ArithmeticException a) {
    
}

Answer: This first handler catches exceptions of type Exception; therefore, it catches any exception, including ArithmeticException. 
The second handler could never be reached. This code will not compile.*/