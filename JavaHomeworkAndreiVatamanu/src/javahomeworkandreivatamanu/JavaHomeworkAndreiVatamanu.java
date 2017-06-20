/**
 *
 * @author Andrei Vatamanu
 */
package javahomeworkandreivatamanu;

import java.util.*;
public class JavaHomeworkAndreiVatamanu {
    
    public static void main(String[] args) {
        
         // Declaring variables
         int x;
         int y;
 // Pregatim citirea datelor de la tastatura
         Scanner input=new Scanner(System.in);
         //requesting first number
         System.out.println("Please introduce your first number:");
         x=input.nextInt();
         //requesting second number
         System.out.println("Please introduce second number");
         y=input.nextInt();

         System.out.println("Please enter operation + - / or *");
         Scanner op=new Scanner(System.in);
         String operation = op.next();

         if (operation.equals("+")){
             System.out.println("Result is:  " + (x+y));
         }
         if (operation.equals("-")){
             System.out.println("Result is:  "+ (x-y));
         }
         if (operation.equals("/")){
             System.out.println("Result is:  "+ (x/y));
         }
         if (operation.equals("*")){
            System.out.println("Result is:  "+ (x*y));
    }
    }
}

