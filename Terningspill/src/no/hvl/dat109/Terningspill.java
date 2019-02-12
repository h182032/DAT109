package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

public class Terningspill {

    private ArrayList<Spiller> spillere;
    private Kopp kopp;

    public Terningspill() {
        this.spillere = new ArrayList<>();
        this.kopp = new Kopp();

    Scanner sc = new Scanner(System.in);
    System.out.println("Antall spillere?");
    int antall = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < antall; i++){
        System.out.println("Navn på spiller nummer " + (i+1));
        leggTilSpiller(sc.nextLine());
    }
    }

    public void leggTilSpiller(String navn) {
        spillere.add(new Spiller(navn));
    }

    public void spill() {
        for (int i = 0; i < spillere.size(); i++) {
            spillere.get(i).spill(kopp);
            System.out.println(spillere.get(i));
            System.out.println();
        }
        System.out.println("Vinneren er: " + finnVinner().getNavn());
    }

    public Spiller finnVinner() {

        Spiller vinner = spillere.get(0);
        for (int i = 1; i < spillere.size(); i++) {
            if (spillere.get(i).getVerdi() > vinner.getVerdi()) {
                vinner = spillere.get(i);
            }
        }
        return vinner;
    }
}
