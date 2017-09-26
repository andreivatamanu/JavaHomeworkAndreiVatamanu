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
public class Barbat extends Thread {
    private final Thread Aspirator;

    private final Thread Femeia;



    public Barbat(Thread Femeia, Thread Aspirator) {

        super("Barbat");

        this.Femeia = Femeia;

        this.Aspirator = Aspirator;

    }



    @Override

    public void run() {

        System.out.println("Barbatul intra in scena. ");

        Femeia.start();

        Aspirator.start();

        while (true) {

            synchronized (this) {

                try {

                    System.out.println("Barbatul aspira.");

                    sleep(1000);

                } catch (InterruptedException e) {

                    System.out.println("Barbatul a oprit aspiratorul");

                    Aspirator.interrupt();

                    System.out.println("Trebuie sa te trezesti");

                    Femeia.interrupt();

                    break;

                }

            }

        }

    }



    public Emisiuni getWifeFavouriteShow() {

        return ((Femeia) Femeia).getHerFavouriteShow();

    }
}
