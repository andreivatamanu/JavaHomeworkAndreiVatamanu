/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.List;

/**
 *
 * @author Samsung
 */
public class Print {
    public static void print(List<? extends Number> list) {
    for (Number n : list) 
        System.out.print(n + " ");
    System.out.println();
}

    
}

//Answer :The program compile
