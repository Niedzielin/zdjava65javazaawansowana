package KontoBankowe;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class Main {
    public static void main(String[] args) {
        int przelewDoBeatki = 500;
        KontoBankowe kontoAndrzeja = new KontoBankowe(123L,1000);
        KontoBankowe kontoBeaty = new KontoBankowe(555L,2000);
        System.out.printf("Andrzej ma: ");
        kontoAndrzeja.wyswietlStanKonta();
        System.out.printf("Beata ma: ");
        kontoBeaty.wyswietlStanKonta();

        kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(przelewDoBeatki));

        System.out.printf("Teraz Andrzej ma: ");
        kontoAndrzeja.wyswietlStanKonta();
        System.out.printf("Teraz Beata ma: ");
        kontoBeaty.wyswietlStanKonta();


    }
}
