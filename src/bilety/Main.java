package bilety;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class Main {
    public static void main(String[] args) {
        Bilet ulgowyGodzinny = Bilet.ULGOWY_GODZINNY;
        Bilet ulgowyCalodniowy = Bilet.ULGOWY_CALODNIOWY;
        Bilet normalnyGodzinny = Bilet.NORMALNY_GODZINNY;
        Bilet normalnyCalodniowy = Bilet.NORMALNY_CALODNIOWY;
        Bilet brakBiletu = Bilet.BRAK_BILETU;
        ulgowyCalodniowy.wyswietlDaneOBilecie();
        System.out.println("Za ulgowy godzinny zapłacisz " + ulgowyGodzinny.getCena()+ "zł");
        System.out.println("Na normalnym za "+normalnyCalodniowy.getCena()+
                "zł pojeździsz przez " + normalnyCalodniowy.getCzasJazdy()/60+"h");
        System.out.println(Bilet.dobierzBilet(true, 70, 25d));
    }
}
