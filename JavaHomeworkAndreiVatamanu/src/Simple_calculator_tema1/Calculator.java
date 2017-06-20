/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_calculator_tema1;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
         int x;
         int y;

         Scanner input=new Scanner(System.in);
         System.out.println("Please introduce your first number:");
         x=input.nextInt();
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
