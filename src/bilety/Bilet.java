package bilety;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public enum Bilet {
    ULGOWY_GODZINNY(1.80d,60),
    ULGOWY_CALODNIOWY(8.20d,1440),
    NORMALNY_GODZINNY(3.60d,60),
    NORMALNY_CALODNIOWY(16.40d,1440),
    BRAK_BILETU();

    public double getCena() {
        return cena;
    }

    public int getCzasJazdy() {
        return czasJazdy;
    }

    private double cena;
    private int czasJazdy;

    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJazdy = czasJazdy;
    }

    Bilet() {
    }
    public double pobierzCeneBiletu(){
        return getCena();
    }
    public int pobierzCzasJazdy(){
        return getCzasJazdy();
    }
    public void wyswietlDaneOBilecie(){
        if (getCzasJazdy()>60) {
            System.out.println("Bilet ważny " + getCzasJazdy() / 60 + "h, kosztował " + getCena() + "zł");
        }
        else {
            System.out.println("Bilet ważny " + getCzasJazdy()+ "min, kosztował " + getCena() + "zł");

        }
    }
    public static Bilet dobierzBilet(boolean czyUlgowy, int czasJazdy, double kwota) {
        if (czyUlgowy) {
            if (czasJazdy <= ULGOWY_GODZINNY.pobierzCzasJazdy() && kwota >= ULGOWY_GODZINNY.pobierzCeneBiletu()) {
                return ULGOWY_GODZINNY;
            } else if (czasJazdy<=ULGOWY_CALODNIOWY.pobierzCzasJazdy() && kwota >= ULGOWY_CALODNIOWY.pobierzCeneBiletu()){
                return ULGOWY_CALODNIOWY;
            }
        }
        else if (!czyUlgowy){
            if (czasJazdy <= NORMALNY_GODZINNY.pobierzCzasJazdy() && kwota >= NORMALNY_GODZINNY.pobierzCeneBiletu()) {
                return NORMALNY_GODZINNY;
            } else if (czasJazdy<=NORMALNY_CALODNIOWY.pobierzCzasJazdy() && kwota >= NORMALNY_CALODNIOWY.pobierzCeneBiletu()){
                return NORMALNY_CALODNIOWY;
            }
        }

            return BRAK_BILETU;

    }
}
