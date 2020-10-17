package Samochod;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class Samochod {
    int predkosc;
    boolean czySwiatlaWlaczone;

    public Samochod(int predkosc, boolean czySwiatlaWlaczone) {
        this.predkosc = predkosc;
        this.czySwiatlaWlaczone = czySwiatlaWlaczone;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public boolean isCzySwiatlaWlaczone() {
        return czySwiatlaWlaczone;
    }

    public void setCzySwiatlaWlaczone(boolean czySwiatlaWlaczone) {
        this.czySwiatlaWlaczone = czySwiatlaWlaczone;
    }

    void przyspiesz(){
        if(this.predkosc<120){
            this.predkosc+=10;
            System.out.println("Przyspieszam do "+this.predkosc+"km/h");
        }
    }
    public void metoda(){
        System.out.println("eeelo jestem w klasie samochód");
    }
    void przelaczSwiatla(){
        if (czySwiatlaWlaczone){
            czySwiatlaWlaczone = false;
        }
        else{
           czySwiatlaWlaczone = true;
        }
    }
}
