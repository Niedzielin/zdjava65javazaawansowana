package Samochod;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class Kabriolet extends Samochod {
    boolean czyDachSchowany;

    public boolean isCzyDachSchowany() {
        return czyDachSchowany;
    }

    public void setCzyDachSchowany(boolean czyDachSchowany) {
        this.czyDachSchowany = czyDachSchowany;
    }

    public Kabriolet(int predkosc, boolean czySwiatlaWlaczone, boolean czyDachSchowany) {
        super(predkosc, czySwiatlaWlaczone);
        this.czyDachSchowany = czyDachSchowany;
    }

    public Kabriolet(int predkosc, boolean czySwiatlaWlaczone) {
        super(predkosc, czySwiatlaWlaczone);
    }

    void schowajDach(){
        if (!czyDachSchowany) {
            czyDachSchowany = true;
        }
    }
    @Override
    public void metoda(){
        System.out.println("Eeeelo to jest klasa kabriolet");
    }
}
