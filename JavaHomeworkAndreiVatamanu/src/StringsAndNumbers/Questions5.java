/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsAndNumbers;

/**
 *
 * @author Samsung
 */
//5 Write a program that computes your initials from your full name and displays them.
public class Questions5 {
    public static void main(String[] args) {
        String myName = "Andrei Vatamanu";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
    }
}
