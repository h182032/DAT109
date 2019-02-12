package no.hvl.dat109;

import java.util.Random;

public class Terning {

    private int verdi;
    private Random rand;

    public Terning(){
        this.rand = new Random();
        this.verdi = 0;
        trill();
    }

    public void trill() {
        verdi = rand.nextInt(6)+ 1;
    }

    public int getVerdi(){
        return verdi;
    }
}
