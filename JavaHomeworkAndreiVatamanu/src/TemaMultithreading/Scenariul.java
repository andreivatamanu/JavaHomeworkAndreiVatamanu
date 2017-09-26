/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaMultithreading;

/**
 *
 * @author Samsung
 */
public class Scenariul {

    private static Tv Tv;
    
    public static void main(String args[]) {

        Thread tv = new Tv(new Barbat(new Femeia(new Tigara()), new Aspirator()));

        tv.start();

    } 
}

    
