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
public class Femeia extends Thread {



    private final Thread womanCigar;

    private final Emisiuni herFavouriteShow;



    public Femeia(Thread Tigara) {

        super("Femeia");

        this.womanCigar = Tigara;

        this.herFavouriteShow = Emisiuni.values()[(new Random()).nextInt(Emisiuni.values().length)];

    }



    @Override

    public void run() {

        System.out.println("Femeia intra in scena. ");

        womanCigar.start();

        while (true) {

            synchronized (this) {

                try {

                    System.out.println("Femeia doarme.");

                    wait();

                } catch (InterruptedException e) {

                    System.out.println("Femeia se trezeste!");

                    System.out.println("Femeia pune deoparte tigara...");

                    womanCigar.interrupt();

                    System.out.println(" si se uita la emisiunea ei preferata: "

                            + herFavouriteShow);

                    break;

                }

            }

        }

    }



    public Emisiuni getHerFavouriteShow() {

        return herFavouriteShow;

    }
}
    
