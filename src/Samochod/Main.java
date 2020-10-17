package Samochod;

/**
 * Created by Hyperbook on 10/17/2020
 **/
public class Main {
    public static void main(String[] args) {

        Kabriolet mazdaMX5 = new Kabriolet(90, false, false);
        System.out.println(mazdaMX5.getPredkosc() + "km/h z dachem schowanym " + mazdaMX5.isCzyDachSchowany() + " " +
                "światłami włączonymi " + mazdaMX5.isCzySwiatlaWlaczone());
        mazdaMX5.schowajDach();
        mazdaMX5.przelaczSwiatla();
        mazdaMX5.przyspiesz();
        System.out.println(mazdaMX5.getPredkosc() + "km/h z dachem schowanym " + mazdaMX5.isCzyDachSchowany() + " światłami" +
                " " +
                "włączonymi " + mazdaMX5.isCzySwiatlaWlaczone());
    }
}
