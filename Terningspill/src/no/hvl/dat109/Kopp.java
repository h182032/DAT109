package no.hvl.dat109;

import java.util.ArrayList;

public class Kopp {

    private int sum;
    private ArrayList<Terning> terninger;

    public Kopp(){
        this.sum = 0;
        this.terninger = new ArrayList<>();

        for(int i = 0; i < 2; i++){
            terninger.add(new Terning());
        }
    }

    public void trill(){
        sum = 0;
        for(int i = 0; i < terninger.size(); i++){
            terninger.get(i).trill();
            sum = terninger.get(i).getVerdi();
        }
    }

    public ArrayList<Terning> getTerninger() {
        return terninger;
    }
    public void setTerninger(ArrayList<Terning> terninger) {
        this.terninger = terninger;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}
