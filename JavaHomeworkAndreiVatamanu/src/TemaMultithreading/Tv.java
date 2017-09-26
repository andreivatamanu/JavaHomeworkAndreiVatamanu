/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemaMultithreading;
import java.util.Random;
/**
 *
 * @author Samsung
 */
public class Tv extends Thread {



    private final Thread Barbat;



    public Tv(Thread Barbat) {

        this.Barbat = Barbat;

    }



    @Override

    public void run() {

        Barbat.start();

        System.out.println("Televizorul merge si ruleaza diferite emisiuni");

        int i;

        try {

            synchronized (this) {

                while (true) {

                    i = (new Random()).nextInt(Emisiuni.values().length);

                    System.out.println("Incepe emisiunea: " + Emisiuni.values()[i]);

                    if (Emisiuni.values()[i].equals(((Barbat) Barbat).getWifeFavouriteShow())) {

                        notifyAll();

                        throw new InterruptedException();

                    }

                }

            }

        } catch (InterruptedException e) {

            Barbat.interrupt();

        }

    }
}

