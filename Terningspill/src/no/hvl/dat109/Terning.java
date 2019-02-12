package no.hvl.dat109;

public class Terning {

    private int verdi;
    private static final int MAX = 6;

    public Terning(){
        this.verdi = 0;
        trill();
    }

    public void trill() {
        verdi = (int)((Math.random() * MAX) + 1);
    }

    public int getVerdi(){
        return verdi;
    }
}
