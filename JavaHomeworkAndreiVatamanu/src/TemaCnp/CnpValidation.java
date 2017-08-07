/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaCnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Samsung
 */
public class CnpValidation {
    
    //validate a CNP as being a number of 13 digits and first digit could be 1 or 2 and next 6 digits are for MMDDYYYY
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter CNP: ");

//read the introduced number
        String number = scan.next();

        if (number.length() != 13) {

            System.out.println("The CNP must have 13 digits");
        } else {
// create a pattern for CNP
            String expresie;
            expresie = "([1-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])(0[1-9]|1[0-2])(19[0-9]{2})(\\d{4})";
            
            Pattern pattern = Pattern.compile(expresie);

// create the matcher as result of applying regex on source string
            Matcher matcher = pattern.matcher(number);
            
//verifying if the CNP introduced matches the pattern defined
            if (matcher.matches()) {

                System.out.println("the CNP is correct");

            } else {
                System.out.println("not correct");
            }
        }
    }

    
}
